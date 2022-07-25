package data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccountResponse(
    @SerialName("status") val status: Int,
    @SerialName("data") val data: AccountData
)

@Serializable
data class AccountData(
    @SerialName("puuid") val id: String,
    @SerialName("region") val region: String,
    @SerialName("account_level") val accountLevel: Int,
    @SerialName("name") val name: String,
    @SerialName("tag") val tag: String,
    @SerialName("card") val card: AccountCard
)

@Serializable
data class AccountCard(
    @SerialName("small") val smallCardUrl: String,
    @SerialName("large") val largeCardUrl: String,
    @SerialName("wide") val wideCardUrl: String
)