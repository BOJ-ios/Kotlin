package com.cookandroid.ch05_2023_kotlin_lambda_highorder_function

fun main() {
    var data: String? = null
    println("data length : ${data?.length ?: 0}")  //?. 연산자가 아니면 에러 발생 --> 널 안전성 호출

    var data2: String? = "DongA"
    println("data2 length : ${data2?.length ?: 0}")  //?. 연산자가 아니면 에러 발생 --> 널 안전성 호출

    println(some("yang"))
    println(some(null))

}

fun some(data: String?):Int {
    return data!!.length //data가 null 이면 nullpointerException을 발생 시킴
}