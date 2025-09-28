import java.time.LocalDate
import java.time.Period



fun command(int:Int):String {
        if(int==1){
            return "Enter the year you were born"
        } 
        else if(int > 1 && int < 3){
            return "Enter the month you were born"
        }
        else {
            return "Enter the day you were bord"
        }
    }

// main (test)
fun main() {
// type in a 4-digit number to represent the year

// step1
var cmd1 = command(1) // Enter your Birth Year
println(cmd1)
val year = readln()
if(year.count() == 4){
    println("You wrote down the year of $year with a length of ${year.count()}!")

// step2
    var cmd2 = command(2) // Enter your Birth Month
    println(cmd2)
    val month = readln()
    if(month.count() <= 2){
        println("You wrote down the month of $month with a length of ${month.count()}!")

// step3
        var cmd3 = command(3) // Enter your Birth Day
        println(cmd3)
        var day = readln()
        if(day.count() <= 2){
            println("You wrote down the day of $day with a length of ${day.count()}!")
        }
    }
}

}