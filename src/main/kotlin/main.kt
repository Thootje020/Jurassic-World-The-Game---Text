

import java.sql.DriverManager
import java.sql.DriverManager.getConnection
import java.sql.ResultSet
import java.sql.SQLException

// Game - Jurassic World
// Author: Thomas Rijken
// Version: 1.0

fun main(args: Array<String>) {

    println("Welcome to Jurassic World")
    println("Whats your username?")

    val username = readLine()!!
    loadScreenToMenu(username)
}


