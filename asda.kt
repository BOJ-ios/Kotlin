fun add(a: Int, b: Int) = a + b
fun multiply(a: Int, b: Int) = a * b

fun main() {
    val operation = if (true) ::add else ::multiply
    println(operation(5, 3))  // 결과는 조건에 따라 달라집니다.
}
