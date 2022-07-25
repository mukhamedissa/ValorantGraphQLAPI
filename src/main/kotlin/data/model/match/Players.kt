package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Players(
    @SerialName("all_players")
    val allPlayers: List<AllPlayer>,
    @SerialName("blue")
    val blueTeam: List<Team>,
    @SerialName("red")
    val redTeam: List<Team>
)