package com.example.navgtion.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navgtion.navigation.nav_graph.detailsNavGraph
import com.example.navgtion.screen.Cart
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
    data object Information : DetailsScreen(route = "DetailsInfo")
    data object Overview : DetailsScreen(route = "OVERVIEW")
}
