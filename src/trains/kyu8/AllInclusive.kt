package trains.kyu8

import kotlin.test.assertEquals

fun allInclusive(target: String, source: ArrayList<String>) = source.contains(target)

fun main(){

    // Immutable variables declare with "val"
    val target1 =  "lorem"
    val target2 = "nilay"

    // Mutable variables declare with "var"
    var target3 = "keven"


    val array: ArrayList<String> = arrayListOf("lorem", "ipsum", "dolor", "sit", "ameta")

    assertEquals(true, allInclusive(target1, array))
    assertEquals(false, allInclusive(target2, array))
    assertEquals(false, allInclusive(target3, array))


    array.remove(target1)
    array.add(target2)
    target3 = "sit"

    assertEquals(true, allInclusive(target2, array))
    assertEquals(false, allInclusive(target1, array))
    assertEquals(true, allInclusive(target3, array))
}