fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Input two arguments!!")
        return
    }
    println("max is " + max(args[0].toInt(), args[1].toInt()))
    println("min is " + min(args[0].toInt(), args[1].toInt()))
}

fun max(a: Int, b: Int) = if (a > b) a else b
fun min(a: Int, b: Int) = if (a < b) a else b
