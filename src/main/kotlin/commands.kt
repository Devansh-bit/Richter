import Cogs.default

class commands {
    val executors:HashMap<String, CommandInterface> = HashMap()

    fun registerCommandClass(commandName:String, commandClass: CommandInterface){
        executors[commandName] = commandClass
    }

    fun findCommand(name:String): CommandInterface {
        var executor:CommandInterface = default()
        if (executors.contains(name)){
            executor = executors[name]!!
        }
        return executor
    }
}