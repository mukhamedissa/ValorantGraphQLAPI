package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerStat(
    @SerialName("ability_casts")
    val abilityCasts: AbilityCasts,
    @SerialName("bodyshots")
    val bodyshots: Int,
    @SerialName("damage")
    val damage: Int,
    @SerialName("damage_events")
    val damageEvents: List<DamageEvent>,
    @SerialName("economy")
    val economy: RoundEconomy,
    @SerialName("headshots")
    val headshots: Int,
    @SerialName("kill_events")
    val killEvents: List<KillEvent>,
    @SerialName("kills")
    val kills: Int,
    @SerialName("legshots")
    val legshots: Int,
    @SerialName("player_display_name")
    val playerDisplayName: String,
    @SerialName("player_puuid")
    val playerPuuid: String,
    @SerialName("player_team")
    val playerTeam: String,
    @SerialName("score")
    val score: Int,
    @SerialName("stayed_in_spawn")
    val stayedInSpawn: Boolean,
    @SerialName("was_afk")
    val wasAfk: Boolean,
    @SerialName("was_penalized")
    val wasPenalized: Boolean
)