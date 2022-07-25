package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerAssets(
    @SerialName("agent")
    val agent: Agent,
    @SerialName("card")
    val card: Card
)