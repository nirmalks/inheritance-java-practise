package interfacePolymorphism

fun main() {
    val sportsCar: Drivable = SportsCar()
    sportsCar.drive()

    val fuelVehicle: FuelVehicle = sportsCar as FuelVehicle
    fuelVehicle.refuel()
}