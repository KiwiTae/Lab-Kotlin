//https://www.codingame.com/ide/puzzle/rock-paper-scissors-lizard-spock

import java.util.*
import java.io.*
import java.math.*


fun isOdd(x: Int) = x % 2 != 0
fun isEven(x: Int) = x % 2 == 0

class Player(val name:Int, val move:String){
    val opp = mutableListOf<Int>()
}

val Rules = mapOf("R" to listOf("L","C"),
        "P" to listOf("R","S"),
        "C" to listOf("P","L"),
        "L" to listOf("S","P"),
        "S" to listOf("C","R")
)

class Match(val p1:Player?, val p2:Player?,var w:Player?=null){
    fun play(){
        p1!!.opp.add(p2!!.name)
        p2!!.opp.add(p1!!.name)

        p1?.let{p2?.let{
            if(p1.move == p2.move){
                if(p1.name < p2.name){ w = p1}else{w = p2}
            }else{
                var check =  Rules[p1.move]?.contains(p2.move)
                check?.let{if(check){ w=p1}else{w = p2}}
            } 
        }}
    }
}

fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val Players = mutableListOf<Player>()
    val Matches = mutableListOf<Match>();
    for (i:Int in 0 until N) {
        Players.add(Player(input.nextInt(),input.next()))
        if(isOdd(i)){
            Matches.add(Match(Players[i-1],Players[i]))
        }

    }

    
    var np1 : Player? = null
    var np2 : Player? = null
    var i = 0
    while(Matches.size > 0){
        Matches[0].play()
        when{
            isEven(i)-> np1 = Matches[0].w
            isOdd(i)-> {np2 = Matches[0].w 
                Matches.add(Match(np1,np2))
                }
        }
        Matches.removeAt(0)
        i++
    }
    
    println("${np1!!.name}")
    println("${np1!!.opp.joinToString(" ")}")
}