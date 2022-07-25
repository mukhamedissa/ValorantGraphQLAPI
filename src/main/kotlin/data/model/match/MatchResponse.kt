package data.model.match

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class MatchResponse(
    @SerialName("data")
    val match: MatchData,
    @SerialName("status")
    val status: Int
)