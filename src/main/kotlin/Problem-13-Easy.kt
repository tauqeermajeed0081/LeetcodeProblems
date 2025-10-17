package org.example

// it starts from high to low and in that case add the number otherwise subtract them
fun romanToInt(romanString: String): Int {
    var convertedInt = 0
    for (index in romanString.indices) {
        val currentCharInt = matchRomanWithInt(romanString[index])
        val nextCharInt = if (index + 1 < romanString.length) matchRomanWithInt(romanString[index + 1]) else 0
        if (currentCharInt >= nextCharInt) {
            convertedInt += currentCharInt
        } else
            convertedInt -= currentCharInt
    }

    return convertedInt
}

fun matchRomanWithInt(romanChar: Char): Int {
    when (romanChar) {
        'I' -> return 1
        'V' -> return 5
        'X' -> return 10
        'L' -> return 50
        'C' -> return 100
        'D' -> return 500
        'M' -> return 1000
    }
    return 0
}