package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamMatchResults(
    @SerialName("has_won")
    val hasWon: Boolean,
    @SerialName("rounds_lost")
    val roundsLost: Int,
    @SerialName("rounds_won")
    val roundsWon: Int
)