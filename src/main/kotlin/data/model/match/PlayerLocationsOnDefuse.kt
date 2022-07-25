package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerLocationsOnDefuse(
    @SerialName("location")
    val location: Location,
    @SerialName("player_display_name")
    val playerDisplayName: String,
    @SerialName("player_puuid")
    val playerPuuid: String,
    @SerialName("player_team")
    val playerTeam: String,
    @SerialName("view_radians")
    val viewRadians: Double
)