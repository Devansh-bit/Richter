import dev.kord.core.entity.Message

interface CommandInterface {
    suspend fun onCommand(name:String, message:Message)
}
