package data.repository

import data.api.ValorantApi
import data.model.match.MatchResponse
import data.model.match.MatchesResponse

interface MatchRepository {
    suspend fun getPlayerMatches(
        region: String,
        username: String,
        tag: String
    ): Result<MatchesResponse>

    suspend fun getMatchDetails(
        matchId: String
    ): Result<MatchResponse>
}

class MatchRepositoryImpl(
    private val valorantApi: ValorantApi
) : MatchRepository {

    override suspend fun getPlayerMatches(
        region: String,
        username: String,
        tag: String
    ): Result<MatchesResponse> =
        try {
            Result.success(valorantApi.getPlayerMatches(region, username, tag))
        } catch (exception: Exception) {
            println(exception)
            Result.failure(exception)
        }

    override suspend fun getMatchDetails(
        matchId: String
    ): Result<MatchResponse> =
        try {
            Result.success(valorantApi.getMatchDetails(matchId))
        } catch (exception: Exception) {
            println(exception)
            Result.failure(exception)
        }
}