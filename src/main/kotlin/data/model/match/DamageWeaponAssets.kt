package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DamageWeaponAssets(
    @SerialName("display_icon")
    val displayIcon: String?,
    @SerialName("killfeed_icon")
    val killfeedIcon: String?
)