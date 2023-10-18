package com.example.navgtion.navgtion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgtion.navgtion.nav_graph.detailsNavGraph
import com.example.navgtion.screen.Cart
import com.example.navgtion.screen.DetailsInfo
import com.example.navgtion.screen.Home
import com.example.navgtion.screen.Profile
import com.example.navgtion.screen.Settings


@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController, BottomBarScreen.Home.route,
        route = Graph.HOME
    ) {
        composable(route = BottomBarScreen.Home.route) {
            Home()
        }
        composable(route = BottomBarScreen.Cart.route) {
            Cart()

        }
        composable(route = BottomBarScreen.Profile.route) {
            Profile()

        }
        composable(route = BottomBarScreen.Settings.route) {
            Settings(
                navController = navController
            )


        }

        detailsNavGraph(navController = navController)



    }
}




sealed class DetailsScreen(val route: String) {
    data object Information : DetailsScreen(route = "INFORMATION")
    data object Overview : DetailsScreen(route = "OVERVIEW")
}
