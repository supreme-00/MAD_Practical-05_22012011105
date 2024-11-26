package com.example.jettyy

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.jettyy.screen.LoginScreen
import com.example.jettyy.screen.RegisterScreen


@Composable
fun AppNavigation(context: Context) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(context,
                navController = navController,
            )
        }
        composable("registration") {
            RegisterScreen(context,
                navController = navController,
            )
        }
    }
}

fun navigateToRegistrationScreen(navController: NavController){
    navController.navigate("registration"){
        popUpTo("login") { inclusive =true}
    }
}
fun navigateToLoginScreen(navController: NavController){
    navController.navigate("login"){
        popUpTo("registration") { inclusive =true}
    }
}