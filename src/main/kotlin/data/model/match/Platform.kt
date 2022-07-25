package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Platform(
    @SerialName("os")
    val os: Os,
    @SerialName("type")
    val type: String
)