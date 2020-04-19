fun main() {
   val capital = mapOf(
           "Jakarta" to "Indonesia",
           "Kuala Lumpor" to "Malaysia",
           "Bangkok" to "Thailand"
   )


    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Berlin","Germany")
    mutableCapital.put("Amsterdam","Holand")

    val mapKeys = mutableCapital.keys
    val mapValues = mutableCapital.values
//
    println(mapKeys)
    println(mapValues)
}