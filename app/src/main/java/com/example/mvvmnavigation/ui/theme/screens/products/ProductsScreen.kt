package com.example.mvvmnavigation.ui.theme.screens.products

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun ProductsScreen(navController: NavController){
    Text(text = "Products in here!!")
}
@Preview(showBackground = true)
@Composable
fun ProductsScreenPreview(){
    MVVMNavigationTheme {
        ProductsScreen(rememberNavController())
    }
}