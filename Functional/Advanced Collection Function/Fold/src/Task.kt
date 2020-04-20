fun main() {
    val numbers = listOf(1, 2, 3, 4)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
    foldNumber()
}


fun foldNumber() {
    val numbers = listOf(1,2,3,4,5,6)
    val fold = numbers.fold(3) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("fold result is $fold")
}