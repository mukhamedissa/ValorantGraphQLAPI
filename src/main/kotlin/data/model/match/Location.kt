package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    @SerialName("x")
    val x: Int,
    @SerialName("y")
    val y: Int
)