fun main(){
println(createString())

    println(infomation("Elsie",37))

    println(word(length = "onamatopeia"))
    println(text("Chariy"))

    }

//Qn 1

fun createString(){
    val school = "Akirachix"
    val out = "${school[0]}${school[2]}${school[3]}"
    println(out)
}
// Qn 2
fun infomation (name: String,age:Int){
    var sentence = "Hi, name is $name I am $age years old"
    println(sentence)
}

// Qn 3.
fun word (length:String):String{
    return ("The length of the length string is" + length.length)

}

    //Qn 4
    fun text(name: String){
        var knight = "Stella"
        if (name.equals("pants")){
            println("Thats me")
        } else {
            println("Thats not me")
        }
        }
