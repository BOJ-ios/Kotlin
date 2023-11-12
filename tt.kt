var data:Int = 100
fun func1(para:Int) {
  var data : Int =para
  data++
  println(data)
}
class Student constructor(var name: String, var age: Int,var height: Int, var gender: String) {
  init {
    this.name = name
    this.age = age
    this.height = height
    this.gender = gender
  }
  fun run() = println("${name} 달립니다.")
  fun study() = println("${name} 공부합니다.")
  fun printInfo() {
    println("이름: ${name}, 나이: ${age}, 키: ${height}, 성별:  ${gender}")
  }
}
fun main(){
  var data : Int = 200
  data++
  println(data)
  func1(data)
  val st1 = Student("asd", 12, 232, "a")
  st1.printInfo()
}