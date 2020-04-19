fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("maxSpeed")
    val maxTank = vehicle.getValue("maxTank")

    // TODO 3
    printTank(type, maxSpeed, maxTank)
}

fun printTank(type: String, maxSpeed: String, maxTank: String ) {
    println ("""
        Vehicle
        Type: $type
        Maximal Speed: $maxSpeed
        Maximal Tank: $maxTank
    """.trimIndent())
}