package com.example.navgtion.navgtion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgtion.screen.Forgot

import com.example.navgtion.screen.Login
import com.example.navgtion.screen.SignUp

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            Login()


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