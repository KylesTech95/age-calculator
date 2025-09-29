import java.time.LocalDate
import java.time.LocalTime
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.Instant
import java.time.Duration
import java.time.Period
import java.time.format.DateTimeFormatter

    fun main () {
        val current_date = LocalDate.now()
        println("Today's date is $current_date\n")

        val current_time = LocalTime.now()
        println("Current time is $current_time\n")

        val current_date_time = LocalDateTime.now()
        println("Current datetime is $current_date_time\n")

        val zoned_date_time = ZonedDateTime.now()
        println("Current Zoned datetime is $zoned_date_time\n")

        val specify_date = LocalDate.of(2024,10,12)
        println("Specificed Date:\n$specify_date\n")

        // val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        val formatted_date = current_date.format(formatter2) // plug formatter into current_date
        println("Formatted current date:\n$formatted_date")
    }