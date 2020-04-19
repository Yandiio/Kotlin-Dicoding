// main function
fun main() {
    printResult(10,sum)
}

fun printResult (Result: Int, sum:(Int) -> Int) {
    val result = sum(Result)
    println(result)
}

var sum: (Int) -> Int = {Result -> Result + Result}