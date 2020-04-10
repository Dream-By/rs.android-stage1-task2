package subtask1

import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        try {
            var dayOf = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val dayOfWeek = dayOf.dayOfWeek.toString()

            val monthIs: String = when (month) {
                "1" -> "января"
                "2" -> "февраля"
                "3" -> "марта"
                "4" -> "апреля"
                "5" -> "мая"
                "6" -> "июня"
                "7" -> "июля"
                "8" -> "августа"
                "9" -> "сентябрь"
                "10" -> "октября"
                "11" -> "ноября"
                "12" -> "декабря"
                else -> "Такой месяц не существует"

            }

            val msg: String = when (dayOfWeek) {
                "SUNDAY" -> ("$day $monthIs, воскресенье")
                "MONDAY" -> ("$day $monthIs, понедельник")
                "TUESDAY" -> ("$day $monthIs, вторник")
                "WEDNESDAY" -> ("$day $monthIs, среда")
                "THURSDAY" -> ("$day $monthIs, четверг")
                "FRIDAY" -> ("$day $monthIs, пятница")
                "SATURDAY" -> ("$day $monthIs, суббота")
                else -> "Такого дня не существует"
            }

            return (msg)
        } catch (e:Exception){
            return "Такого дня не существует"
        }


        throw NotImplementedError("Not implemented")
    }

}
