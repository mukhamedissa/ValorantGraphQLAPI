package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FriendlyFire(
    @SerialName("incoming")
    val incoming: Int,
    @SerialName("outgoing")
    val outgoing: Int
)