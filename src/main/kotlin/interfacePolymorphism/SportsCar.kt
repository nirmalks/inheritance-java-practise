package interfacePolymorphism

class SportsCar: Drivable, FuelVehicle {
    override fun drive() {
        println("sports car driven")
    }

    override fun refuel() {
        println("sports car refueled")
    }

    open fun someSportsCarMethod() {
        println("some sports car method")
    }
}