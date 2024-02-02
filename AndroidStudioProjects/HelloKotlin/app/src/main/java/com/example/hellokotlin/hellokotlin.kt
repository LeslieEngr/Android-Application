package com.example.hellokotlin
import java.util.*

fun main()
{
    var s1 = Scanner(System.`in`)
    print("plese enter a text ")

    var text = s1.nextLine()
    count(text)

}

fun count(text: String){
    var ch = text.toCharArray()

    var letter = 0

    var space = 0
    var num = 0

    var other = 0

    for(c in ch.withIndex()){
        if(Character.isLetter(c.value)){
            letter ++
        }
        else if(Character.isDigit(c.value)){
            num++
        }
        else if(Character.isSpaceChar (c.value)){
            space++
        }
        else {
            other++
        }
    }
    print("Space $space , Letter : $letter , other : $other, num = $num ")
}