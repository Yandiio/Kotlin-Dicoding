// main function
fun main() {
    val number = arrayOf(10, 20, 30, 40)
    println(setsArray(number))

    val numbers = intArrayOf(10,20,30,40,50,60)
    println(sets(10,*numbers))
}

fun sets(vararg number: Int): Int {
    return number.size
}

// comparasion between Array<T> and vararg

fun setsArray (number: Array<Int>) :Int {
    return number.size
}