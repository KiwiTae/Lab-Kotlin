/*Lambdas
Kotlin supports a functional style of programming. Read about higher-order functions and function literals (lambdas) in
Kotlin.

Pass a lambda to any function to check if the collection contains an even number. The function any gets a predicate as
an argument and returns true if there is at least one element satisfying the predicate.

 */

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }