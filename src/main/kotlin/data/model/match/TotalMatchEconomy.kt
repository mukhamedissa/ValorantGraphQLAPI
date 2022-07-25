package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TotalMatchEconomy(
    @SerialName("loadout_value")
    val loadoutValue: LoadoutValue,
    @SerialName("spent")
    val spent: Spent
)