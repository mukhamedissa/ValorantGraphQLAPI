import data.routing.getAccountDetails
import di.clientNetworkModule
import io.ktor.server.application.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.routing.*
import org.koin.ktor.plugin.Koin

fun Application.main() {
    install(StatusPages)
    install(Koin) {
        modules(listOf(clientNetworkModule))
    }
}

fun Application.module() {
    routing {
        getAccountDetails()
    }
}

fun main(args: Array<String>) = EngineMain.main(args)
