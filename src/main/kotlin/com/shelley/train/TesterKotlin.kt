package com.shelley.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println(" Please enter number of tickets:");
    val totalTicketNum = scanner.nextInt();
    println("How many round-trip tickets:");
    val roundTripNum = scanner.nextInt();

    val totalAmount = (totalTicketNum - roundTripNum) * 1000 + roundTripNum * 2000 * 0.9
    print("totalTicketNum: $totalTicketNum  Round-trip: $roundTripNum total: $totalAmount")

}