// main function
fun main() {
//    Avoid duplication index of array
//    val integers = setOf(1,2,3,4,5,4,3,2,1,0)
//    println(integers)

// comparing set value
    val setA = mutableSetOf(1,3,4,5,6)
    val setB = mutableSetOf(1,3,4,5,6,1,3,8)

    setB.add(2)

    println(setA == setB)

    println(7 in setB)

    val setC = setOf(1,5,7,2,8)
    val union = setA.union(setC)
    val intersect = setC.intersect(setB)

    println(union)
    print(intersect)
}