package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AbilityCasts(
    @SerialName("c_cast")
    val cCast: Int?,
    @SerialName("e_cast")
    val eCast: Int?,
    @SerialName("q_cast")
    val qCast: Int?,
    @SerialName("x_cast")
    val xCast: Int?
)