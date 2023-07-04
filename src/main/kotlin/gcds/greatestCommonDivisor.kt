package gcds

class MySolution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var trueDivisor = ""
        var i = 1
        while (i < str1.length + 1) {
            val divisor = str1.substring(0, i)
            val isDivisor1 = str1.replace(divisor, "") == ""
            val isDivisor2 = str2.replace(divisor, "") == ""
            if (isDivisor1 && isDivisor2) {
                trueDivisor = divisor
            }
            i++
        }
        return trueDivisor
    }
}

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        // Check if gcd exists
        if (str1 + str2 != str2 + str1) {
            return ""
        }

        var lengthOfFirstString = str1.length
        var lengthOfSecondString = str2.length
        while (lengthOfFirstString != lengthOfSecondString) {
            if (lengthOfFirstString > lengthOfSecondString) lengthOfFirstString -= lengthOfSecondString
            else lengthOfSecondString -= lengthOfFirstString
        }

        return str1.substring(0, lengthOfFirstString)
    }
}