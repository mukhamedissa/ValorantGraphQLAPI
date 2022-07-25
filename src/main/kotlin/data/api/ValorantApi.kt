package data.api

import data.model.AccountResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

interface ValorantApi {
    suspend fun getAccountDetails(
        username: String,
        tag: String
    ): AccountResponse
}

class ValorantApiImpl(
    private val client: HttpClient
) : ValorantApi {

    override suspend fun getAccountDetails(
        username: String,
        tag: String
    ): AccountResponse =
        client.get {
            url {
                path(ACCOUNT_PATH)
                appendPathSegments(username, tag)
            }
        }.body()
}