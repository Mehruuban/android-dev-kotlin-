fun main() {

    val bmw = Car("bmw","petrol",1000)
    val oodi = Car ("oodi","petrol",3500)
    println(bmw.name)
    println(bmw.type)
    println(bmw.kmRun)

println("--------------------------------------------")

    println(oodi.name)
    println(oodi.type)
    println(oodi.kmRun)

    bmw.driveCar()
    bmw.applyBrakes()


}

class  Car (val name: String , val type : String , var kmRun : Int) // properties
 {

    fun driveCar (){        // Methods
        println("$name  Car is driving")
    }

    fun applyBrakes (){
        println("brake applied")
    }

}