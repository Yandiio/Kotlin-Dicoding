fun main() {
    val valueA = 101
    val valueB = 52
    var valueC = 99

    val result = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA,valueB,null);

    println("""
        ResultA is $result
        ResultB is $resultB
    """.trimIndent())
}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO
    val result = valueA + (valueB - (valueC?:50))
    return result
}
