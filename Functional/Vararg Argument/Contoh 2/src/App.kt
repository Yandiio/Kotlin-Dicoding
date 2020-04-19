// main function
fun main() {
    println(sets(1,2,3,4,5,6, name = "name"))
}

fun sets(vararg Number: Int, name: String ): Any {
    return "${Number.size} $name"
}