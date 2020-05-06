/*
SAM conversions
When an object implements a SAM interface (one with a Single Abstract Method), you can pass a lambda instead. Read more about SAM-conversions.

In the previous example change an object expression to a lambda.

CheckRevertShow answer
 */

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y-x })
    return arrayList
}