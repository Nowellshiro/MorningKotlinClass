fun main() {
    var firstname = "Noelle"
    var lastname = "Ann"

    var text ="Hello there"
    println(firstname)
    println(lastname)
    println(firstname+"" +lastname)//string concatination
    println(text[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String interpolation
    println(text + "Joe")
    println("My firstname is $firstname")
    println("My firstname is $firstname $lastname")


}