package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlantEvents(
    @SerialName("plant_location")
    val plantLocation: PlantLocation?,
    @SerialName("plant_site")
    val plantSite: String?,
    @SerialName("plant_time_in_round")
    val plantTimeInRound: Int?,
    @SerialName("planted_by")
    val plantedBy: PlantedBy?,
    @SerialName("player_locations_on_plant")
    val playerLocationsOnPlant: List<PlayerLocationsOnPlant>?
)