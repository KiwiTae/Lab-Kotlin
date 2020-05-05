//https://www.codingame.com/training/easy/horse-racing-duals

import java.util.*
import java.io.*
import java.math.*

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val L = IntArray(N) { input.nextInt() }
    L.sort()
    
    var res = 999
    for (i in 0 until N-1) {
        val pi = L[i+1] - L[i]
        if (res > pi){
            res = pi
        }
    }

    println("$res")
}