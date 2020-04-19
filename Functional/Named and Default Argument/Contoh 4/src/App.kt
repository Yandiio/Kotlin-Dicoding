fun main() {
    val fishStats = getFishStats(name = "Mujair Slyphustia", length = 200L)
    println(fishStats)
}

fun getFishStats(name: String = "Cupangae Sycludsa", length: Long = 100L): Any {
    return "$name $length"
}
