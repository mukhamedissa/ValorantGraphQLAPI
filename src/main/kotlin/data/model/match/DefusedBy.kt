package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DefusedBy(
    @SerialName("display_name")
    val displayName: String,
    @SerialName("puuid")
    val puuid: String,
    @SerialName("team")
    val team: String
)