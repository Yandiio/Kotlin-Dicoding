// main function
fun main() {
    val playerName = getPlayerName(name= "Michael Owen", club = "Manchester United", number = 10)
    println(playerName)
}

fun getPlayerName(name: String, number: Int, club: String){
    println("$name $number $club")
}