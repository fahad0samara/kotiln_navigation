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
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },

            )


        }
        composable(route = AuthScreen.SignUp.route) {
            SignUp()



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