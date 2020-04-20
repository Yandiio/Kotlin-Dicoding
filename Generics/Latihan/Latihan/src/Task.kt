// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    printResult(stringResult, intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when(args) {
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}

fun printResult(stringResult: Int, intResult: Int) {
    println("String result: $stringResult")
    println("Result: $intResult")
}
