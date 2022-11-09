package polymorphism

class Tiger: Animal() {
    override fun move() {

        println("tiget move")
    }

    override fun eat() {

        println("tiget eat")
    }

    fun tigerSpecificMethod() {
        println("tiger specific method")
    }
}