package dev.abhishekbansal

import io.kotless.dsl.ktor.Kotless
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.routing.*

//fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

//@Suppress("unused") // Referenced in application.conf
//@kotlin.jvm.JvmOverloads
//fun Application.module(testing: Boolean = false) { // gzip, deflate
//    install(Compression)
//    routing {
//        get("/") {
//            call.respond("Hello World")
//        }
//    }
//}

class Server: Kotless() {
    override fun prepare(app: Application) {
        app.install(Compression)
        app.routing {
            get("/") {
                call.respond("Hello World")
            }
        }
    }
}