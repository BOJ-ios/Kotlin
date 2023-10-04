class User(val name: String) {
    init {
        println("주 생성자: 이름은 $name 입니다.")
    }
    constructor(name: String, age: Int) : this(name) {
        println("보조 생성자: 이름은 $name, 나이는 $age 입니다.")
    }
    constructor(name: String, age: Int, height: Int) : this(name, age){
        println("보조 생성자: 이름은 $name, 나이는 $age, 키는 $height 입니다.")
    }
    constructor() : this(name= "unknown") {
        println("보조 생성자: 이름 정보가 없습니다.")
    }
}
data class DataClass(val name: String, val email: String, val age: Int) {
    lateinit var address: String
    constructor(name: String, email: String, age: Int, address: String) : this(name, email, age) {
        this.address = address
    }
}

fun main() {
    val obj1 = DataClass("kkang", "A@a.com", 10, "Seoul")
    val obj2 = DataClass("kkang", "A@a.com", 10, "Busan")
    println("obj1.equals(obj2): ${obj1 == obj2}") 



    // 1. 주 생성자를 사용하여 객체 생성
    val user1 = User("John")
    println();
    // 2. 첫 번째 보조 생성자를 사용하여 객체 생성
    val user2 = User("Jane", 25)
    println();
    // 3. 두 번째 보조 생성자를 사용하여 객체 생성
    val user3 = User("Emily", 30, 160)
    println();
    // 4. 세 번째 보조 생성자를 사용하여 객체 생성
    val user4 = User()

    // 1. 람다 함수 사용 예제
    val square: (Int) -> Int = { x -> x * x }
    println("제곱: ${square(5)}")  // 출력: "제곱: 25"

    // 2. 고차 함수 사용 예제
    fun operateOnNumber(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    
    val sum = operateOnNumber(5, 3) { x, y -> x + y }
    val multi = operateOnNumber(5, 3) { x, y -> x * y }
    println("합: $sum")  // 출력: "합: 8"
    println("곱: $multi")  // 출력: "합: 8"
}
