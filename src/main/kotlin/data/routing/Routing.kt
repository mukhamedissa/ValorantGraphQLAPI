package data.routing

import data.repository.AccountRepository
import data.repository.MatchRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getAccountDetails() {
    val repository: AccountRepository by inject()

    get("account/{username}/{tag}") {
        val username = call.parameters["username"] ?: return@get
        val tag = call.parameters["tag"] ?: return@get

        repository.getAccountDetails(username, tag).getOrNull()?.let { accountResponse ->
            call.respond(accountResponse.toString())
        }
    }
}

fun Routing.getPlayerMatches() {
    val repository: MatchRepository by inject()

    get("matches/{region}/{username}/{tag}") {
        val region = call.parameters["region"] ?: return@get
        val username = call.parameters["username"] ?: return@get
        val tag = call.parameters["tag"] ?: return@get

        repository.getPlayerMatches(region, username, tag).getOrNull()?.let { matchesResponse ->
            call.respond(matchesResponse.toString())
        }
    }
}