package com.example.myapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapp.ui.screens.*

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object AddTransaction : Screen("add_transaction")
    object CreditCards : Screen("credit_cards")
    object AddCreditCard : Screen("add_credit_card")
    object Statistics : Screen("statistics")
    object Settings : Screen("settings")
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.AddTransaction.route) {
            AddTransactionScreen(navController)
        }
        composable(Screen.CreditCards.route) {
            CreditCardsScreen(navController)
        }
        composable(Screen.AddCreditCard.route) {
            AddCreditCardScreen(navController)
        }
        composable(Screen.Statistics.route) {
            StatisticsScreen(navController)
        }
        composable(Screen.Settings.route) {
            SettingsScreen(navController)
        }
    }
} 