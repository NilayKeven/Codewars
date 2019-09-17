package trains.kyu8

import java.lang.IllegalArgumentException
import kotlin.test.assertEquals


// -Task-
// Given a year, return the century it is in.

fun centuryFromYear(year: Int): Int{
    return when{
        year < 0 -> throw IllegalArgumentException("Year can not be negative")
        year <= 100 -> 1
        year % 100 == 0 -> year / 100
        else -> year / 100 + 1
    }
}

fun main(){
    assertEquals(1, centuryFromYear(12))
    assertEquals(2, centuryFromYear(101))
    assertEquals(18, centuryFromYear(1800))
    assertEquals(19, centuryFromYear(1890))
}