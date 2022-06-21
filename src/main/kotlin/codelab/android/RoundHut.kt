package codelab.android

import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(residents: Int,
                    val radius: Double) : Dwelling(residents) {

    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double = PI * radius * radius

    fun calculateMaxCarpetSize(): Double = sqrt((2 * radius) * (2 * radius) / 2)

}