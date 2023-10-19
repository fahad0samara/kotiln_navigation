package com.example.navgtion.navgtion

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgtion.screen.auth.Forgot

import com.example.navgtion.screen.auth.Login
import com.example.navgtion.screen.auth.SignUp

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            Login(
                onLoginClick = { _, _ ->
                    // Implement your login logic here
                    // After successful login, navigate to the home screen
                    navController.navigate(Graph.HOME)
                },
                onRegisterClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                },
                onForgotPasswordClick = {
                    navController.navigate(AuthScreen.Forgot.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route) {
            SignUp(
                onRegisterClick = {
                    // Implement your register logic here
                    // After successful login, navigate to the home screen
                    navController.navigate(Graph.HOME)}
                ,
                onLoginClick={navController.navigate(AuthScreen.Login.route)}
            )




        }
        composable(route = AuthScreen.Forgot.route) {
            Forgot {
                navController.popBackStack()
                navController.navigate(Graph.HOME)
            }

        }
    }
}



sealed class AuthScreen(val route: String) {
    data object Login : AuthScreen(route = "Login")
    data object SignUp : AuthScreen(route = "SignUp")
    data object Forgot : AuthScreen(route = "Forgot")
}