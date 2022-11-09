package polymorphism

open class Animal {
    open fun move() {
        println("animal move")
    }
    open fun eat() {
        println("animal eat")
    }

    fun animalSpecificMethod() {
        println("some animal speicif method")
    }
}