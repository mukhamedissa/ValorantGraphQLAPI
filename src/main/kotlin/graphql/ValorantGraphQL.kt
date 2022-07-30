package graphql

import GraphQL
import graphql.schema.getAccount
import graphql.schema.getMatchDetails
import graphql.schema.getMatches
import io.ktor.server.application.*

fun Application.configureGraphQL() {
    install(GraphQL) {
        playground = false
        endpoint = "valorant-graphql"

        schema {
            getAccount()
            getMatches()
            getMatchDetails()
        }
    }
}