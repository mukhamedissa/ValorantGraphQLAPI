package data.model.match


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Spent(
    @SerialName("average")
    val average: Int,
    @SerialName("overall")
    val overall: Int
)