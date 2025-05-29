fun main(){
  var a = ABC("a",22)
    var b = ABC("b" , 44)
    println(a.name)
    b.age = 23
    b.age = -12
}

class  ABC (nameParam : String ,ageParam: Int){
    var name : String = nameParam
    var age : Int = ageParam

    // for Setter

        set(value) {
            if (value >=0 ){
                field = value
            } else{
                println("age cant be negettive")
            }
        }

}