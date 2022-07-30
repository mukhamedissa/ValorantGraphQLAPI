package graphql.schema

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import data.model.match.MatchResponse
import data.repository.MatchRepository
import org.koin.core.context.GlobalContext

fun SchemaBuilder.getMatchDetails() {
    val matchRepository: MatchRepository by GlobalContext.get().inject()

    type<MatchResponse>()
    query("match") {
        resolver { matchId: String ->
            matchRepository.getMatchDetails(matchId).getOrNull()
        }
    }
}