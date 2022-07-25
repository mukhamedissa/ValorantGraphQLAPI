package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatchData(
    @SerialName("kills")
    val kills: List<KillEvent>,
    @SerialName("metadata")
    val metadata: Metadata,
    @SerialName("players")
    val players: Players,
    @SerialName("rounds")
    val rounds: List<Round>,
    @SerialName("teams")
    val teams: Teams
)