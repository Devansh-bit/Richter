package Cogs

import CommandInterface
import dev.kord.common.entity.Snowflake
import dev.kord.core.entity.Message

class kick:CommandInterface{
    override suspend fun onCommand(name: String, message: Message) {
        val content = message.content.replace("!$name ","")
        println(content.toLong())
        message.getGuild().getMember(Snowflake(content.toLong())).kick("meme")
    }
}

