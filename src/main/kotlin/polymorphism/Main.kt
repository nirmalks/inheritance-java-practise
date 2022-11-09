package polymorphism

fun main() {
    val animal = Animal()
    val b = Tiger()
    val c = Lion()

    val animalCast: Animal = Tiger()
    println(animalCast.eat())
    //println(animalCast.tigerSpecificMethod())  // not possible
    println(animalCast.animalSpecificMethod())
    println(animalCast.eat())
//    val lion = Lion()

}