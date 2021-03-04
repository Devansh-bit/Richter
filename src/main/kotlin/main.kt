
import Cogs.*
import dev.kord.common.entity.IntegrationExpireBehavior
import dev.kord.core.Kord
import dev.kord.core.event.message.MessageCreateEvent
import dev.kord.core.on
import java.io.File
import java.util.ArrayList

import java.util.Enumeration

import java.io.IOException
import java.net.URL
import java.nio.file.Paths


suspend fun main(){
    val kord = Kord("ODE3MTA1OTEyMzUwMzc1OTM2.YEErLg.4fzG353XNuBwentH6LI9VvzUrUA")
    val commandsUtil = commands()
    commandsUtil.registerCommandClass("say", say())
    commandsUtil.registerCommandClass("ping", Ping())
    commandsUtil.registerCommandClass("kick", kick())



    kord.on<MessageCreateEvent> {
        if(message.author?.isBot != false) return@on
        if(!message.content.startsWith("!")) return@on
        var commandStr = message.content.split(" ")[0].replace("!", "")
        println(commandStr)
        commandsUtil.findCommand(commandStr).onCommand(commandStr, message)
    }

    kord.login()
}








