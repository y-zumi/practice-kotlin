
class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}

fun main(args: Array<String>) {
    val name = if (args.isEmpty()) "Unknown" else args[0]
    Greeter(name).greet()
}
