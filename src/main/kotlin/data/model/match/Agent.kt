package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Agent(
    @SerialName("bust")
    val bust: String,
    @SerialName("full")
    val full: String,
    @SerialName("killfeed")
    val killfeed: String,
    @SerialName("small")
    val small: String
)