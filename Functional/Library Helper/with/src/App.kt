// main function
fun main() {
    val message = "Hello Kotlin user"
    val dataResult = with(message) {
        println("Message is $this")
        println("and the length is ${this.length}")
    }

    println(dataResult)
    message()
}


fun message() {
    val message = "Hello Kotlin!"
    val messageValue = with(message) {
        println("first character is ${this[0]}")
        println("and the last character is ${this[this.length - 2]}")
    }
}