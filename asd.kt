fun Calculator(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
  println("Calculate")
    return operation(a, b)
}

val lambdaSum: (Int, Int) -> Int = {
   x, y -> 
   println("lambdaSum")
   x + y 
}
val lambdaSub: (Int, Int) -> Int = { x, y -> x - y }
val lambdaMul: (Int, Int) -> Int = { x, y -> x * y }
val lambdaDiv: (Int, Int) -> Int = { x, y -> x / y }

fun main() {
    val sum = Calculator(5, 3, lambdaSum)
    val sub = Calculator(5, 3, lambdaSub)
    val mul = Calculator(5, 3, lambdaMul)
    val div = Calculator(5, 3, lambdaDiv)

    println("합: $sum")
    println("차: $sub")
    println("곱: $mul")
    println("나: $div")
}
