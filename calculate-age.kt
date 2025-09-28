import java.time.LocalDate
import java.time.Period

// global variable - list of strings
var global_list: List<String> = listOf("year", "month", "day")

// get variable's type
fun getVariableType(variable:Any) : String { // since we are getting a type, we can use any data type
    val getclass = variable::class;
    val simplename = getclass.simpleName;
    // println(simplename)
    return "$simplename"
}

// send out a command
fun command(int:Int):String {
    // helper function
    fun dialogue(string:String):String{
        if(getVariableType(string)!="String"){
            return "Check the type and try again";
        } else {
            return "Enter the $string you were born"
        }
    }
        // println(dialogue("year"))
        // println(dialogue("month"))
        // println(dialogue("day"))

        if(int==1){
            return dialogue("year")
        } 
        else if(int > 1 && int < 3){
            return dialogue("MONTH")
        }
        else {
            return dialogue("day")
        }
    }



/*---------------------------------------------------- */
// main (test)
fun main() {
// step1
var cmd1 = command(1) // Enter your Birth Year
println(cmd1)
val year = readln()
if(year.count() == 4){
    println("You wrote down the year of $year with a length of ${year.count()}!")

// step2
    var cmd2 = command(2) // Enter your Birth Month
    println(cmd2)
    var month = readln()
    if(month.count() >= 1){
        println(month)
    }
    
    if(month.count() <= 2){
        println("You wrote down the month of $month with a length of ${month.count()}!")

// step3
        var cmd3 = command(3) // Enter your Birth Day
        println(cmd3)
        var day = readln()
        if(day.count() <= 2){
            println("You wrote down the day of $day with a length of ${day.count()}!")

            // get birthdate in localDate format
            val birthdate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            // get the currentdate in localDate format
            val current_date = LocalDate.now()

            println(current_date)
            // get the current age with the .between(birthdate,currentdate) function
            val period = Period.between(birthdate,current_date)

            println("You are ${period.years} yeard old!")
        }
    }
}
}
/*---------------------------------------------------- */
