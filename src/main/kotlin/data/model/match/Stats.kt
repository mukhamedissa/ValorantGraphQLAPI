package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stats(
    @SerialName("assists")
    val assists: Int,
    @SerialName("bodyshots")
    val bodyshots: Int,
    @SerialName("deaths")
    val deaths: Int,
    @SerialName("headshots")
    val headshots: Int,
    @SerialName("kills")
    val kills: Int,
    @SerialName("legshots")
    val legshots: Int,
    @SerialName("score")
    val score: Int
)