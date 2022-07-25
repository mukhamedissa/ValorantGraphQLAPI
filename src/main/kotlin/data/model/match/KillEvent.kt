package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KillEvent(
    @SerialName("assistants")
    val assistants: List<Assistant>?,
    @SerialName("damage_weapon_assets")
    val damageWeaponAssets: DamageWeaponAssets?,
    @SerialName("damage_weapon_id")
    val damageWeaponId: String?,
    @SerialName("damage_weapon_name")
    val damageWeaponName: String?,
    @SerialName("kill_time_in_match")
    val killTimeInMatch: Int?,
    @SerialName("kill_time_in_round")
    val killTimeInRound: Int?,
    @SerialName("killer_display_name")
    val killerDisplayName: String?,
    @SerialName("killer_puuid")
    val killerPuuid: String?,
    @SerialName("killer_team")
    val killerTeam: String?,
    @SerialName("player_locations_on_kill")
    val playerLocationsOnKill: List<PlayerLocationsOnKill>?,
    @SerialName("round")
    val round: Int?,
    @SerialName("secondary_fire_mode")
    val secondaryFireMode: Boolean?,
    @SerialName("victim_death_location")
    val victimDeathLocation: VictimDeathLocation?,
    @SerialName("victim_display_name")
    val victimDisplayName: String?,
    @SerialName("victim_puuid")
    val victimPuuid: String?,
    @SerialName("victim_team")
    val victimTeam: String?
)