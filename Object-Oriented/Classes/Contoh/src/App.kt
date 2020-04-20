class car(val name: String,
          val weight: String,
          val long: Long,
          val manufacturer: String) {

    fun speed() {
        println("$name ngebut")
    }

    fun brake() {
        println("$name ngerem")
    }
}

fun main() {
    val ferrariCar = car("Portofino",weight = "1260Kg", manufacturer = "Ferrari", long = 1000L)
    println("Name Car : ${ferrariCar.name}, Manufacturer: ${ferrariCar.manufacturer} , Weight : ${ferrariCar.weight} , Long : ${ferrariCar.long}   ")
    ferrariCar.brake()
    ferrariCar.speed()
}
