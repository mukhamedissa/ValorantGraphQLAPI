package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Os(
    @SerialName("name")
    val name: String,
    @SerialName("version")
    val version: String
)