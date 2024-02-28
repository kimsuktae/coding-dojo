class Solution {

    //I -> 1
    //V -> 5
    //X -> 10
    //L -> 50
    //C -> 100
    //D -> 500
    //M -> 1000
    fun romanToInt(roman: String): Int {
        var value = 0

        for (i: Int in roman.indices) {
            if (i == roman.length - 1) {
                value += toInt(roman[i])

                continue
            }

            val toAdd = toInt(roman[i])
            val nextToAdd = toInt(roman[i + 1])

            if (toAdd < nextToAdd) {
                value -= toAdd

                continue
            }

            value += toAdd

        }

        return value
    }

    private fun toInt(roman: Char): Int {
        return when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalArgumentException("없졍")
        }
    }
}
