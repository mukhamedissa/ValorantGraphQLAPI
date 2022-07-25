package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SessionPlaytime(
    @SerialName("milliseconds")
    val milliseconds: Int?,
    @SerialName("minutes")
    val minutes: Int?,
    @SerialName("seconds")
    val seconds: Int?
)