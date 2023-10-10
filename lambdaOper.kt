
fun Calculator(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
  var result = operation(a, b)
  println("$a: $b: $result")
}
val lambdaSum(a: Int, b: Int): Int {x,y -> x + y}
val lambdaSub(a: Int, b: Int): Int {x,y -> x - y}
val lambdaMul(a: Int, b: Int): Int {x,y -> x * y}
val lambdaDiv(a: Int, b: Int): Int {x,y -> x / y}

fun main() {// 2. 고차 함수 사용 예제
  val sum = Calculator(5, 3,lambdaSum) 
  val sub = Calculator(5, 3,lambdaSub) 

  println("합: $sum")
  println("차: $sub")
}