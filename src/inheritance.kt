//Parent Class/Base class/Super class
open class Animal{
    var age = 12
    var gender = "Male"

    fun makeSound(){
        println("Animal is speaking")
    }
}

//Child class/Derived class/Sub class
class Dog:Animal(){
    fun bark(){
        println("Dog is woofing")
    }
}

class Cat:Animal(){
    fun meow(){
        println("Cat is meowing")
    }
}

fun main() {
    var a = Animal()
    var d = Dog()
    d.makeSound()

    var c = Cat()

}