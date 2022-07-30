package graphql.schema

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import data.model.account.AccountResponse
import data.repository.AccountRepository
import org.koin.core.context.GlobalContext

fun SchemaBuilder.getAccount() {
    val accountRepository: AccountRepository by GlobalContext.get().inject()

    type<AccountResponse>()
    query("account") {
        resolver { username: String, tag: String ->
            accountRepository.getAccountDetails(username, tag).getOrNull()
        }
    }
}