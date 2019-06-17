package functionalthinking.chapter6

class Weapon constructor(val name : String) {


    var sound: (() -> String)? = null


    fun fight() {
        println(sound)
    }
}