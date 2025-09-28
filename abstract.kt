import java.time.LocalDate
import java.time.Period

fun calculateAge(birthYear: Int, birthMonth: Int, birthDay: Int): Int {
    // Create a LocalDate object for the birth date
    val birthDate = LocalDate.of(birthYear, birthMonth, birthDay)

    // Get the current date
    val currentDate = LocalDate.now()

    // Calculate the period between the birth date and the current date
    val period = Period.between(birthDate, currentDate)

    // The age in years is the years component of the period
    return period.years
}

fun main() {
    // Example usage:
    val yearOfBirth = 1995
    val monthOfBirth = 5 // May
    val dayOfBirth = 27

    val age = calculateAge(yearOfBirth, monthOfBirth, dayOfBirth)
    println("You are $age years old.")
    println("You are born on $dayOfBirth/$monthOfBirth/$yearOfBirth is $age years old.")


    // Another example
    val anotherYear = 2005
    val anotherMonth = 1 // January
    val anotherDay = 25
    val anotherAge = calculateAge(anotherYear, anotherMonth, anotherDay)
    // println("Someone born on $anotherDay/$anotherMonth/$anotherYear is $anotherAge years old.")
}