package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Round(
    @SerialName("bomb_defused")
    val bombDefused: Boolean,
    @SerialName("bomb_planted")
    val bombPlanted: Boolean,
    @SerialName("defuse_events")
    val defuseEvents: DefuseEvents?,
    @SerialName("end_type")
    val endType: String,
    @SerialName("plant_events")
    val plantEvents: PlantEvents,
    @SerialName("player_stats")
    val playerStats: List<PlayerStat>,
    @SerialName("winning_team")
    val winningTeam: String
)