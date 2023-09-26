fun main() {
  var list = listOf<Int>(10,20,30)
  for (i in list) {
    println(i)
  }
} 

open class Super(name: String) {
}
class Sub(name: String): Super(name) {
}

open class Super2(name: String) {
}
class Sub2: Super2 {
	constructor(name: String): super(name) {
	}
}