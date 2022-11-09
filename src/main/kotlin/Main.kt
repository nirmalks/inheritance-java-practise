fun main() {
    val a = ClassA()
    val b = ClassB(2)
    val c = ClassC()
    println(c.num)
    c.num = 50
    println(c.num)
    println(b.num)
}