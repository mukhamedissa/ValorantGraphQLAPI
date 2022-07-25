package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Card(
    @SerialName("large")
    val large: String,
    @SerialName("small")
    val small: String,
    @SerialName("wide")
    val wide: String
)