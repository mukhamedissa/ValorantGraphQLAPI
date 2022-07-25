package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Armor(
    @SerialName("assets")
    val assets: KillEventAsset?,
    @SerialName("id")
    val id: String?,
    @SerialName("name")
    val name: String?
)