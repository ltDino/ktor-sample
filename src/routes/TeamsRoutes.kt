package com.example.routes

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

fun Route.teamsRouting() {
    route("/teams") {
        get {
//            call.respond("{\"code\":404,\"msg\":\"success\",\"globalMsg\":\"success\"}")
        }
        get("{teamId}/members") {

       }
    }
}

fun Application.registerTeamsRoutes(){
    routing {
        teamsRouting()
    }
}