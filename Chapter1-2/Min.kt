fun main(args: Array<String>) {
    print(min(10, 5))
}

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b 
}
