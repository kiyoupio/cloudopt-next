package net.cloudopt.next.eventbus.test

import net.cloudopt.next.eventbus.EventBusManager
import net.cloudopt.next.json.Jsoner
import net.cloudopt.next.web.Resource
import net.cloudopt.next.web.route.API
import net.cloudopt.next.web.route.GET
import net.cloudopt.next.web.route.POST

@API("/eventbus")
class TestController : Resource() {

    private val address = "net.cloudopt.next.eventbus.test.a"

    private val message = Jsoner.json("key" to "value")

    @GET
    fun index(){
        renderText("welcome")
    }

    @POST("/send")
    suspend fun send() {
        EventBusManager.send(address, message)
        renderText("success")
    }

    @POST("/publish")
    suspend fun publish() {
        EventBusManager.publish(address, message)
        renderText("success")
    }

}