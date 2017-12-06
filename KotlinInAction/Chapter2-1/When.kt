enum class Color {
	RED,
	BLUE,
	GREEN,
	NONE
}
fun main(args: Array<String>) {
	val colors = arrayOf(Color.RED, Color.BLUE, Color.GREEN, Color.NONE)

	for (color in colors) {
		when (color) {
			Color.RED -> {
				println("Color is ${color}!")
				println("This color is normal")
			}
			Color.BLUE -> {
				println("Color is ${color}!?")
				println("This color is normal")
			}
			Color.GREEN -> {
				println("Color is ${color}??")
				println("This color is normal")
			}
			else -> {
				println("Color is None...")
			}
		}
	}
}
