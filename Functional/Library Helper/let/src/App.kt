// main function
fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = print ("text $length")
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }
}