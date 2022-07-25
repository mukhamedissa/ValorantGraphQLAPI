package data.routing

import data.repository.AccountRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Routing.getAccountDetails() {
    val repository: AccountRepository by inject()

    get("account/{username}/{tag}") {
        val username = call.parameters["username"] ?: return@get
        val tag = call.parameters["tag"] ?: return@get

        val accountDetails = repository.getAccountDetails(username, tag)
        call.respond(accountDetails.toString())
    }
}