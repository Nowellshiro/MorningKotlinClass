fun main() {
    //While loop

    var number =20
    while (number <= 25){
        println("Number : $number")
        number ++
    }
    //Do while loop
    var count = 1
    do{
        println("Count is $count")
        count ++
    }while (count <= 5)

    //For loop
    for (num in 100..105)
        println("Num is $num")
    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

    //Break statement
    for (x in 10..15){
        if (x == 12){
            break
        }
        println("Number is $x")
    }
    //Continue statement
    for (myletter in 'a'..'d'){
        if (myletter == 'b'){
            continue
        }
        println("Letter is $myletter")
    }


}