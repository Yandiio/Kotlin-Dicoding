fun main() {
    val number = 1.rangeTo(100)
    val evenNumber = number.filter(::isEvenNumber)
    val oddNumber = number.filter(Int::isOddNumber)



    println(evenNumber)
    println(oddNumber)
}

fun isEvenNumber (Number: Int) = Number % 2 == 0

fun Int.isOddNumber() = this % 2 == 1
