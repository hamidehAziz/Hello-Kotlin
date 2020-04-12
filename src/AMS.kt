import java.util.*
import java.util.Random

fun main(args: Array<String>) {
    feedTheFish()


//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie()
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy"))
//            break
//    }
}


fun feedTheFish() {
    var day = randomDay()
    var food = fishFood(day)
    println("Today is $day and fish eat $food")
}

fun randomDay(): String {
    val week = listOf<String>("Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {
    val food = "fasting"
    return when(day){
        "Sunday" ->  "aloo"
        "Monday" ->  "beh"
        "Tuesday"->  "esfenaj"
        "Wednesday"->"sibzamani"
        "Thursday"-> "porteghal"
        "Friday"->   "kooft"
        "Saturday"-> "sabzi"
            else ->  "fasting"
    }

}


