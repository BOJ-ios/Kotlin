

fun main() {
    var data:String? = "asdf";
    var length = data?.length;
    println(length);

    var nullable: String? = null
    val nonNullable: String = nullable ?: "null이다"


    var str2 = """
             asdawd
    asdasd
    """
    println(str2);
}