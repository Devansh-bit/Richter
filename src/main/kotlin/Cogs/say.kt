package Cogs

import CommandInterface
import dev.kord.core.entity.Message

class say:CommandInterface {
    override suspend fun onCommand(name: String, message: Message) {
        val content = message.content.replace("!$name ","")
        message.channel.createMessage(content)
    }
}