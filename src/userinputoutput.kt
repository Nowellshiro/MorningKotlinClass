import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your firstname:")
    var firstname = readln()
    println("My firstname is $firstname")

    println("Enter age :")
    var age = read.nextInt()
    println("I am $age years old")

    println("Enter weight")
    var weight = read.nextDouble()
    println("I am $weight kilograms")


}