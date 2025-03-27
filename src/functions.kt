fun main() {
    //Standard -Library Functions/Predefined function

    var output = Math.sqrt(81.0)
    println("The squareroot of81.0 is $output")

    var roundedvalue = Math.round(34.78)
    println(roundedvalue)

    //calling function
    name()
    add()
    employee("John", 90000, false)
    employee("Martha", 60000, true)
    employee("Brian", 40000, false)

    student("Mary",23, "Software engineering")

}

//User-defined Functions
fun name() {

    println("Cynthia")
}

fun add(){
    var x = 20
    var y = 30
    println(x + y)
}

//Parameter/Variable and Argument/Value
fun employee (name: String, salary:Int,disability:Boolean){
    println("$name is earning $salary. Disability :$disability")
}

fun student(name: String, age:Int, course:String){
    println("$name is $age years old. She is studying $course")
}



