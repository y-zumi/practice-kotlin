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
			}
			Color.BLUE -> {
				println("Color is ${color}!?")
			}
			Color.GREEN -> {
				println("Color is ${color}??")
			}
			else -> {
				println("Color is None...")
			}
		}
	}
}
