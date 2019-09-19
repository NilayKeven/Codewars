package trains.kyu8

import kotlin.math.pow
import kotlin.test.assertEquals


fun squareSum(numbers: Array<Int>): Int{
    var result: Double = 0.0
    for (number in numbers){
        result += number.toDouble().pow(2.0)
    }
    return result.toInt()
}

fun main(){
    assertEquals(29, squareSum(arrayOf(2, 3, 4)))
    assertEquals(150, squareSum(arrayOf(10, 6, 3, 2, 1)))
}