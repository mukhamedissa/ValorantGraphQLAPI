package graphql.schema

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import data.model.match.MatchesResponse
import data.repository.MatchRepository
import org.koin.core.context.GlobalContext

fun SchemaBuilder.getMatches() {
    val matchRepository: MatchRepository by GlobalContext.get().inject()

    type<MatchesResponse>()
    query("matches") {
        resolver { region: String, username: String, tag: String ->
            matchRepository.getPlayerMatches(region, username, tag).getOrNull()
        }
    }
}