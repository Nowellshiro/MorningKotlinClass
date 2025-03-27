import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your firstnumber")
    var num1 = read.nextInt()

    println("Enter secondnumber")
    var num2 = read.nextInt()

    println("Enter thirdnumber")
    var num3 = read.nextInt()


    if (num1 >= num2 && num1>= num3){
        println("$num1 is the greatest")
    }
    else if (num2 >= num1 && num2>= num3) {
        println("$num2 is the greatest")
    }
    else{
        println("$num3 is the greatest")
    }


}