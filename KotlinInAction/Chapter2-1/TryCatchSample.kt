fun main(args: Array<String>) {
    val number = 110
    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("A percentage value must be between 0 and 100: ${number}")

    println(percentage)
}
