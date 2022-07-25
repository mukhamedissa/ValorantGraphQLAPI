package di

import data.api.ValorantApi
import data.api.ValorantApiImpl
import data.repository.AccountRepository
import data.repository.AccountRepositoryImpl
import data.repository.MatchRepository
import data.repository.MatchRepositoryImpl
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import org.koin.dsl.module

internal const val ENDPOINT = "https://api.henrikdev.xyz"

val clientNetworkModule = module {
    single {
        Json {
            ignoreUnknownKeys = true
            explicitNulls = false
            coerceInputValues = true
        }
    }
    single {
        HttpClient(CIO) {
            install(ContentNegotiation) {
                json(get())
            }
            install(Logging) {
                level = LogLevel.ALL
            }

            defaultRequest {
                url(ENDPOINT)
                accept(ContentType.Application.Json)
            }
        }
    }

    single<ValorantApi> {
        ValorantApiImpl(get())
    }
}

val clientDataModule = module {
    factory<AccountRepository> {
        AccountRepositoryImpl(get())
    }
    factory<MatchRepository> {
        MatchRepositoryImpl(get())
    }
}