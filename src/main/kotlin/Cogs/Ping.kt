package Cogs

import CommandInterface
import dev.kord.core.entity.Message

class Ping:CommandInterface{
    override suspend fun onCommand(name: String, message: Message) {
        message.channel.createMessage("Pong!")
    }
}