class Motor {
    var name = "Ducati Panigale"
    get() {
        println("Get Data")
        return field
    }
    set(value) {
        println("Set Data")
        field = value
    }
}

fun main () {
    val motorcycleName = Motor()
    println("${motorcycleName.name}")
    motorcycleName.name = "Honda CBR100 RR"
    println("${motorcycleName.name}")
}