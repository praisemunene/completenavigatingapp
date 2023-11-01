package com.example.mvvmnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.screens.about.AboutScreen
import com.example.mvvmnavigation.ui.theme.screens.home.HomeScreen
import com.example.mvvmnavigation.ui.theme.screens.login.LoginScreen
import com.example.mvvmnavigation.ui.theme.screens.products.ProductsScreen
import com.example.mvvmnavigation.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUTE_HOME
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUTE_PRODUCTS) {
            HomeScreen(navController = navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController)
        }
    }
}