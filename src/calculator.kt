import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter firstnumber: ")
    val num1 = scanner.nextDouble()

    println("Enter operator(+,-,*,/); ")
    val operator = scanner.next()[0]

    println("Enter second number: ")
    val num2 = scanner.nextDouble()


    var result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '/' -> num1 / num2
        '*' -> num1 * num2

        else -> "Invalid operator"

    }
    println("The answer is $result")
}