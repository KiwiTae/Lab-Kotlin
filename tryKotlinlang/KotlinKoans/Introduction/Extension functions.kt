/*
Extension functions
Read about extension functions. Then implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumber.

 */

fun Int.r(): RationalNumber = RationalNumber(this,1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first,second)

data class RationalNumber(val numerator: Int, val denominator: Int)