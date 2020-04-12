import java.util.*

fun main(args: Array<String>) {

   var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy"))
            break
    }
}

fun getFortune(birthday : Int?): String {

    val fortune = listOf<String>(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    //fortune[birthday!!.rem(fortune.size)]
     val index = when (birthday) {
        in 1..7 -> 4
         28,31 -> 6
        else -> birthday?.rem(fortune.size)
        }
    return fortune[index!!]
}

fun getBirthday() : Int? {
    print("Enter your Birthday ")
    return readLine()?.toIntOrNull() ?: 1
}


fun dayOfWeek() {
    println("What Day Is Today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")
        else -> { // Note the block
            print("calender is not working")
        }
    }
}
