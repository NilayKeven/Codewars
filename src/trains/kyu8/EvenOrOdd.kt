package trains.kyu8

import kotlin.test.assertEquals

// Modulo operator is used to calculate the remainder.
fun evenOrOdd(number: Int) = if (number % 2 == 0) "Even" else "Odd"

// "rem" function calculates the remainder of dividing one value by the other value.
fun evenOrOdd1(number: Int): String = if (number.rem(2) == 0) "Even" else "Odd"

fun main(){
    assertEquals("Even", evenOrOdd(-6))
    assertEquals("Odd", evenOrOdd(3))

    assertEquals("Even", evenOrOdd1(8))
    assertEquals("Odd", evenOrOdd1(11))
}