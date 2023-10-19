package com.example.navgtion.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navgtion.navigation.DetailsScreen
import com.example.navgtion.navigation.Graph

import com.example.navgtion.screen.DetailsInfo

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route) {
            DetailsInfo(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }
        composable(route = DetailsScreen.Overview.route) {
            DetailsInfo(name = DetailsScreen.Overview.route) {
                navController.popBackStack()
            }
        }

    }
}
