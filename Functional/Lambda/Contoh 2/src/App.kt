fun main() {
    val messageLength = getMessageLength("My Message is prophet")
    println("message length is $messageLength")
}

val getMessageLength = { message:String -> message.length}