class Person{
    var name = "Joe"
    var age = 34
    var location = "Westlands"

    fun speak(){
        println("Doctor is speaking")
    }
}

fun main() {
    var doctor1 = Person()
    doctor1.speak()

    println(doctor1.name)
}
