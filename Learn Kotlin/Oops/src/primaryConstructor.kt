fun main(){

    val person = Person1("Mehru",20)
    println("name = ${person.name}")
    println("age = ${person.age}")

    val mm = meharban("Meharba Alam", 20)
}
class Person1 (val name : String , var age : Int){

}


class  meharban (name : String , age : Int){
    var Firstname = name
    var personAge = age

    //initializer block
    init {
        Firstname = name.capitalize()
        personAge = age.plus(2)

        println("First name = $Firstname")
        println("Age = $personAge")
    }
}