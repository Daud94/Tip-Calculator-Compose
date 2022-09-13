package com.example.tipcalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 100.0
        val tipPercent = 20.00
        val expectedTip = "$20.00"
        val actualTip = calculateTip(amount,tipPercent,false)
        assertEquals(expectedTip,actualTip)
    }
}