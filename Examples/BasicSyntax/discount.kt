fun main(args: Array<String>) {
    val discount = 0.8
    var sum = 0.0
    var value = 10000.0
    while (value >= 0.00000000000001) {
        sum += value
        value *= discount
        println(sum)
    }
}
