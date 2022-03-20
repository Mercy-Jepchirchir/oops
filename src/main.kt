fun main(){
      var   Chirii=Human("mercy",50,80)
       Chirii.eat(2)
       println(Chirii.weight)

        Chirii.speak("toit")

         Chirii.birthday(1)


        var Mercy= user("Jackline","Kemboi","jacklinekemboi@gmail.com" +
                "","0713520935","kiiiii")
         println(Mercy)
        var tut= user("John","Kipro","ballykemboi@gmail.com" +
            "","01111120935","66yyyyyy")
         println(tut)

}
class Human(var name:String, var age:Int, var weight:Int){

    fun eat(foodWeight:Int){
        weight+=foodWeight

        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(add:Int){
        age += 1
        println(age)

    }
}
data class user(var firstName:String,var lastName:String,var email:String,var phonenumber:String,var password:String)