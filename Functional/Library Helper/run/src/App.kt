// main function
fun main() {
    val text = "hello"
    val runText = text.run {
        val from = this
        val to = this.replace("hello", "Kaan")
        "Value is $from to $to"
    }

    println("Run : $runText")
}