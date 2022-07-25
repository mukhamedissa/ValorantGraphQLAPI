package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Behavior(
    @SerialName("afk_rounds")
    val afkRounds: Int,
    @SerialName("friendly_fire")
    val friendlyFire: FriendlyFire,
    @SerialName("rounds_in_spawn")
    val roundsInSpawn: Int
)