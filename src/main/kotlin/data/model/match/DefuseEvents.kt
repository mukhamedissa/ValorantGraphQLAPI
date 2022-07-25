package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DefuseEvents(
    @SerialName("defuse_location")
    val defuseLocation: DefuseLocation?,
    @SerialName("defuse_time_in_round")
    val defuseTimeInRound: Int?,
    @SerialName("defused_by")
    val defusedBy: DefusedBy?,
    @SerialName("player_locations_on_defuse")
    val playerLocationsOnDefuse: List<PlayerLocationsOnDefuse>?
)