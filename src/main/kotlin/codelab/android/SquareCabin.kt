package codelab.android

class SquareCabin(residents: Int,
                  val length: Double) : Dwelling(residents) {

    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea() =  length * length

}