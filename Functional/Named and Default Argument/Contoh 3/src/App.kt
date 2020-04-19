// main function
fun main() {
    val fullName = getFullName()
    print(fullName)
}

fun getFullName(name: String = "Kotlin", fullName: String = "Kotlin bin Itlin"): String{
    return "$name $fullName"
}