package data.repository

import data.api.ValorantApi
import data.model.match.MatchesResponse

interface MatchRepository {

    suspend fun getPlayerMatches(
        region: String,
        username: String,
        tag: String
    ): Result<MatchesResponse>
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
}