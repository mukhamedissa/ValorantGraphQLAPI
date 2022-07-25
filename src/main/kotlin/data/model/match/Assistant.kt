package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Assistant(
    @SerialName("assistant_display_name")
    val assistantDisplayName: String,
    @SerialName("assistant_puuid")
    val assistantPuuid: String,
    @SerialName("assistant_team")
    val assistantTeam: String
)