package data.api

import data.model.account.AccountResponse
import data.model.match.MatchResponse
import data.model.match.MatchesResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

interface ValorantApi {
    suspend fun getAccountDetails(
        username: String,
        tag: String
    ): AccountResponse

    suspend fun getPlayerMatches(
        region: String,
        username: String,
        tag: String
    ): MatchesResponse

    suspend fun getMatchDetails(
        matchId: String
    ): MatchResponse
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

    override suspend fun getPlayerMatches(
        region: String,
        username: String,
        tag: String
    ): MatchesResponse =
        client.get {
            url {
                path(MATCHES_PATH)
                appendPathSegments(region, username, tag)
            }
        }.body()

    override suspend fun getMatchDetails(
        matchId: String
    ): MatchResponse =
        client.get {
            url {
                path(MATCH_PATH)
                appendPathSegments(matchId)
            }
        }.body()
}