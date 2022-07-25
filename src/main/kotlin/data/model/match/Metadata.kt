package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Metadata(
    @SerialName("cluster")
    val cluster: String,
    @SerialName("game_length")
    val gameLength: Int,
    @SerialName("game_start")
    val gameStart: Int,
    @SerialName("game_start_patched")
    val gameStartPatched: String,
    @SerialName("game_version")
    val gameVersion: String,
    @SerialName("map")
    val map: String,
    @SerialName("matchid")
    val matchid: String,
    @SerialName("mode")
    val mode: String,
    @SerialName("platform")
    val platform: String,
    @SerialName("queue")
    val queue: String,
    @SerialName("region")
    val region: String,
    @SerialName("rounds_played")
    val roundsPlayed: Int,
    @SerialName("season_id")
    val seasonId: String
)