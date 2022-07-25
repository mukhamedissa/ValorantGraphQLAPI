package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatchesResponse(
    @SerialName("data")
    val matches: List<MatchData>,
    @SerialName("status")
    val status: Int
)