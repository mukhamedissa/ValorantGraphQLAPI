package graphql

import GraphQL
import data.model.account.AccountResponse
import data.model.match.MatchResponse
import data.model.match.MatchesResponse
import data.repository.AccountRepository
import data.repository.MatchRepository
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureGraphQL() {
    val accountRepository: AccountRepository by inject()
    val matchRepository: MatchRepository by inject()

    install(GraphQL) {
        playground = false
        endpoint = "valorant-graphql"

        schema {
            type<AccountResponse>()
            query("account") {
                resolver { username: String, tag: String ->
                    accountRepository.getAccountDetails(username, tag).getOrNull()
                }
            }

            type<MatchesResponse>()
            query("matches") {
                resolver { region: String, username: String, tag: String ->
                    matchRepository.getPlayerMatches(region, username, tag).getOrNull()
                }
            }

            type<MatchResponse>()
            query("match") {
                resolver { matchId: String ->
                    matchRepository.getMatchDetails(matchId).getOrNull()
                }
            }
        }
    }
}