import java.util.Scanner

fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    /*var scan = Scanner(System.`in`)*/
    var check:Int = scan.nextInt()
    var grade:Int = scan.nextInt()
    if(check > 10){
        when(grade){
            in 0..60 -> println("D")
            in 60..70 -> println("C")
            in 70..80 -> println("B")
            in 80..90 -> println("A")
            in 90..100 -> println("S")
        }
    }else {
        println("F")

    }

}
