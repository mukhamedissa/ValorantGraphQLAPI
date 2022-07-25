package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DamageEvent(
    @SerialName("bodyshots")
    val bodyshots: Int,
    @SerialName("damage")
    val damage: Int,
    @SerialName("headshots")
    val headshots: Int,
    @SerialName("legshots")
    val legshots: Int,
    @SerialName("receiver_display_name")
    val receiverDisplayName: String,
    @SerialName("receiver_puuid")
    val receiverPuuid: String,
    @SerialName("receiver_team")
    val receiverTeam: String
)