package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RoundEconomy(
    @SerialName("armor")
    val armor: Armor,
    @SerialName("loadout_value")
    val loadoutValue: Int,
    @SerialName("remaining")
    val remaining: Int,
    @SerialName("spent")
    val spent: Int,
    @SerialName("weapon")
    val weapon: Weapon
)