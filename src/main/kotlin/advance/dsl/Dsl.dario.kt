// Domain-Specific languages in Kotlin
package main.kotlin.advance.dsl

class Request(val accept: String)
class Response(var statusCode: Int, var content: String)
class Handler(val request: Request, val response: Response)

class ResponseEnhanced(var statusCode: Int, var content: String) {
    operator fun invoke(function: ResponseEnhanced.() -> Unit) {

    }
}
class HandlerEnhanced(val request: Request, val response: ResponseEnhanced)

fun getRouteV1(path: String, handle: (Request, Response) -> Unit) { handle(Request("application/json"), Response(200, "OK")) }
fun getRouteV2(path: String, handle: (Handler) -> Unit) { handle(Handler(Request("application/json"), Response(200, "OK"))) }
// Extention functions
fun getRouteV3(path: String, handle: Handler.() -> Unit) { handle(Handler(Request("application/json"), Response(200, "OK"))) }
fun getRouteV4(path: String, handle: HandlerEnhanced.() -> Unit) { handle(HandlerEnhanced(Request("application/json"), ResponseEnhanced(200, "OK"))) }

fun main(args: Array<String>) {

    getRouteV1("/home", {
            req, res ->
                if (req.accept == "application/json") {
                    //language=JSON
                    res.content = "{\"name\" :  \"Escaping!\"}"
                }
    })

    getRouteV1("/home") {
        req, res ->
            if (req.accept == "application/json") {
                //language=JSON
                res.content = "{\"name\" :  \"Escaping!\"}"
            }
    }

    getRouteV2("/home") {
            if (it.request.accept == "application/json") {
                //language=JSON
                it.response.content = "{\"name\" :  \"Escaping!\"}"
            }
    }

    getRouteV3("/home") {
        if (request.accept == "application/json") {
            //language=JSON
            response.content = "{\"name\" :  \"Escaping!\"}"
        }
    }

    getRouteV4("/home") {
        if (request.accept == "application/json") {
            //language=JSON
            response {
                content = "{\"name\" :  \"Escaping!\"}"
            }
        }
    }

}