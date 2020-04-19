// main function
fun main() {
    println(sumAllNumbers(  10,20,30,40))
    println(getSizeNumbers(10,20,50,80,90))
}

fun sumAllNumbers(vararg number: Int): Any {
    return number.sum()
}

fun getSizeNumbers(vararg number: Int): Any {
    return number.size
}