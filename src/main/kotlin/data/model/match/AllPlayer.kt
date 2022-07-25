package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AllPlayer(
    @SerialName("ability_casts")
    val abilityCasts: AbilityCasts,
    @SerialName("assets")
    val playerAssets: PlayerAssets,
    @SerialName("behavior")
    val behavior: Behavior,
    @SerialName("character")
    val character: String,
    @SerialName("currenttier")
    val currenttier: Int,
    @SerialName("currenttier_patched")
    val currenttierPatched: String,
    @SerialName("damage_made")
    val damageMade: Int,
    @SerialName("damage_received")
    val damageReceived: Int,
    @SerialName("economy")
    val totalMatchEconomy: TotalMatchEconomy,
    @SerialName("level")
    val level: Int,
    @SerialName("name")
    val name: String,
    @SerialName("party_id")
    val partyId: String,
    @SerialName("platform")
    val platform: Platform,
    @SerialName("player_card")
    val playerCard: String,
    @SerialName("player_title")
    val playerTitle: String,
    @SerialName("puuid")
    val puuid: String,
    @SerialName("session_playtime")
    val sessionPlaytime: SessionPlaytime,
    @SerialName("stats")
    val stats: Stats,
    @SerialName("tag")
    val tag: String,
    @SerialName("team")
    val team: String
)