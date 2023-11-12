
fun Calculator(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
  var result = operation(a, b)
  // println("$a: $b: $result")
  return result
}
val lambdaSum: (Int,Int) -> Int = {a : Int,b : Int -> a + b}
val lambdaSub: (Int,Int) -> Int = {a,b -> a - b}
val lambdaMul = {a : Int, b : Int -> a * b}
val lambdaDiv = {a : Int, b : Int ->  a / b}

fun main() {// 2. 고차 함수 사용 예제
  val sum = Calculator(5, 3,lambdaSum) 
  val sub = Calculator(5, 3,lambdaSub) 
  val mul = Calculator(5, 3,lambdaMul)
  val div = Calculator(5, 3,lambdaDiv)

  println("합: $sum")
  println("차: $sub")
  println("곱: $mul")
  println("나: $div")
}
