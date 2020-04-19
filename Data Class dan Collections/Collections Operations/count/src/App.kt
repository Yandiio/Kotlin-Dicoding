// main function
fun main() {
   val numberList = listOf(1,2,3,4,5,6,7,8,9,10)

    val countData = numberList.count()
    val countEvenData = numberList.count { it % 2 == 0 }

    println(countData)
    println(countEvenData)
}