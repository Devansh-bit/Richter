package Cogs

import CommandInterface
import dev.kord.core.entity.Message

class default:CommandInterface{
    override suspend fun onCommand(name: String, message: Message) {
    }
}