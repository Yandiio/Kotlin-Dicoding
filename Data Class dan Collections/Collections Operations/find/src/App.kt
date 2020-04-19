fun main () {
    val ListNumber = listOf(1,2,3,4,5,6,7,8,9,10)

    println(ListNumber.firstOrNull() { it % 2 == 1 })
}