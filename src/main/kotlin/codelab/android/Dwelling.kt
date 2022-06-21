package codelab.android


abstract class Dwelling(var residents: Int) {

    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean = residents < capacity

    abstract fun floorArea(): Double

    fun getRoom() = if (capacity > residents){
        residents++
        println("You got a room!")
    } else {
        println("Sorry, at capacity and no rooms left.")
    }

}