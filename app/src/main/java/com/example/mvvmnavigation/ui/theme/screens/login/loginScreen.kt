package com.example.mvvmnavigation.ui.theme.screens.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun LoginScreen(navController: NavController){
    Text(text = "Welcome to Login page")
}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    MVVMNavigationTheme {
        LoginScreen(rememberNavController())
    }
}