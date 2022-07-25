package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Teams(
    @SerialName("blue")
    val blue: TeamMatchResults,
    @SerialName("red")
    val red: TeamMatchResults
)