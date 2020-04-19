var message = "Kotlin"

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Island")

    println(::message.get())
}