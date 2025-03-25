package com.gulsenurgunes.composependikmunicipality1.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gulsenurgunes.composependikmunicipality1.R
import com.gulsenurgunes.composependikmunicipality1.component.AuthTextField
import com.gulsenurgunes.composependikmunicipality1.component.PrimaryButton
import com.gulsenurgunes.composependikmunicipality1.component.RedirectTextRow
import com.gulsenurgunes.composependikmunicipality1.signup.SignUp

@Composable
fun SignIn() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
    ) {
        Text(
            "Lets Sign you in",
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 128.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text("Welcome Back,\nYou have been missed", fontSize = 24.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(36.dp))
        AuthTextField("Email,phone & username")
        AuthTextField("password")
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Forgot Password ?",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.End)
        )
        Spacer(modifier = Modifier.height(16.dp))
        PrimaryButton(text = "Sign In", onClick = { })
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.Gray)
            Text(
                text = "or",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 8.dp),
                color = Color.Black
            )
            HorizontalDivider(modifier = Modifier.weight(1f), color = Color.Gray)
        }
        SocialIconsRow()
        Spacer(modifier = Modifier.height(8.dp))
        RedirectTextRow(normalText = "Don't have an account?", actionText = " Register New", onClick = { })
    }
}

data class SocialProvider(
    val name: String,
    val iconRes: Int,
    val onClick: () -> Unit
)

@Composable
fun SocialIconsRow() {
    val providers = listOf(
        SocialProvider("Google", R.drawable.ic_launcher_foreground) {
        },
        SocialProvider("Facebook", R.drawable.ic_launcher_foreground) {
        },
        SocialProvider("Apple", R.drawable.ic_launcher_foreground) {
        }
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        providers.forEach { provider ->
            IconButton(
                onClick = provider.onClick,
                modifier = Modifier
                    .size(56.dp)
                    .padding(horizontal = 8.dp)
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
            ) {
                Image(
                    painter = painterResource(id = provider.iconRes),
                    contentDescription = "${provider.name} ile giriş",
                    modifier = Modifier.size(28.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    SignIn()
}