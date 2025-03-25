package com.gulsenurgunes.composependikmunicipality1.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gulsenurgunes.composependikmunicipality1.component.AuthTextField
import com.gulsenurgunes.composependikmunicipality1.component.PrimaryButton
import com.gulsenurgunes.composependikmunicipality1.component.RedirectTextRow

@Composable
fun SignUp() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
    ) {
        Text(
            "Lets Register\nAccount",
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 128.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text("Hello user, you have\na greatful journey", fontSize = 24.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(36.dp))
        AuthTextField("Name")
        AuthTextField("Buissness name")
        AuthTextField("Phone")
        AuthTextField("Email")
        AuthTextField("Password")
        Spacer(modifier = Modifier.height(16.dp))
        PrimaryButton(text = "Sign Up", onClick = { })
        Spacer(modifier = Modifier.height(8.dp))
        RedirectTextRow(
            normalText = "Already have an account ?",
            actionText = " Login",
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUp()
}