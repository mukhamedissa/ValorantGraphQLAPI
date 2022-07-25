package data.repository

import data.model.AccountResponse
import data.api.ValorantApi

interface AccountRepository {
    suspend fun getAccountDetails(
        username: String,
        tag: String
    ): Result<AccountResponse>
}

class AccountRepositoryImpl(
    private val valorantApi: ValorantApi
) : AccountRepository {
    override suspend fun getAccountDetails(
        username: String,
        tag: String
    ): Result<AccountResponse> =
        try {
            Result.success(valorantApi.getAccountDetails(username, tag))
        } catch (exception: Exception) {
            Result.failure(exception)
        }
}