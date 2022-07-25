import data.routing.getAccountDetails
import data.routing.getMatchDetails
import data.routing.getPlayerMatches
import di.clientDataModule
import di.clientNetworkModule
import io.ktor.server.application.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.routing.*
import org.koin.ktor.plugin.Koin

fun Application.main() {
    install(StatusPages)
    install(Koin) {
        modules(listOf(clientNetworkModule, clientDataModule))
    }
}

fun Application.module() {
    routing {
        getAccountDetails()
        getPlayerMatches()
        getMatchDetails()
    }
}

fun main(args: Array<String>) = EngineMain.main(args)
