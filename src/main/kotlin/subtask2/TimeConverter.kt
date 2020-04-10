package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {

        var timeToThis = ""

        if (minute.toInt()>60) {
            return timeToThis
        } else {

        if (minute.toInt()==0)
        {
            timeToThis = ("${changeHour(hour)} o' clock")
            return timeToThis

        }  else {

            if (minute.toInt() > 0 && minute.toInt() < 31) {

                timeToThis = ("${minuteS(minute)} past ${changeHour(hour)}")
            } else {
                var hourS: Int = hour.toInt()
                hourS = ++hourS
                timeToThis = ("${minuteS(minute)} to ${changeHour(hourS.toString())}")
            }

            return timeToThis
        }
        }

        throw NotImplementedError("Not implemented")
    }

    fun changeHour (h:String):String {
        when (h) {
            "0" -> return "zero"
            "1" -> return "one"
            "2" -> return "two"
            "3" -> return "three"
            "4" -> return "four"
            "5" -> return "five"
            "6" -> return "six"
            "7" -> return "seven"
            "8" -> return "eight"
            "9" -> return "nine"
            "10" -> return "ten"
            "11" -> return "eleven"
            "12" -> return "twelve"
        }
        return changeHour(h)
    }

    fun minuteS (m:String):String {

        when (m.toInt()){

            1,59 -> return  "one minute"
            2,58 -> return  "two minutes"
            3,57 -> return  "three minutes"
            4,56 -> return  "four minutes"
            5,55 -> return  "five minutes"
            6,54 -> return  "six minutes"
            7,53 -> return  "seven minutes"
            8,52 -> return  "eight minutes"
            9,51 -> return  "nine minutes"
            10,50 -> return  "ten minutes"
            11,49 -> return  "eleven minutes"
            12,48 -> return  "twelve minutes"
            13,47 -> return  "thirteen minutes"
            14,46 -> return  "fourteen minutes"
            15,45 -> return  "quarter"
            16,44 -> return  "sixteen minutes"
            17,43 -> return  "seventeen minutes"
            18,42 -> return  "eighteen minutes"
            19,41 -> return  "nineteen minutes"
            20,40-> return  "twenty minutes"
            21,39 -> return  "twenty one minute"
            22,38 -> return  "twenty two minutes"
            23,37 -> return  "twenty three minutes"
            24,36 -> return  "twenty four minutes"
            25,35 -> return  "twenty five minutes"
            26,34 -> return  "twenty six minutes"
            27,33 -> return  "twenty seven minutes"
            28,32 -> return  "twenty eight minutes"
            29,31 -> return  "twenty nine minutes"
            30 -> return  "half"
            else -> ""
        }
        return minuteS(m)
    }


}
