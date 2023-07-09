package words

class Solution {
    fun reverseWords(s: String): String = s.trim().split("\\s+".toRegex()).reversed().joinToString(" ")

    fun reverseWords2(s: String): String {
        val result = CharArray(s.length)
        var resultInd = 0

        var end = s.length - 1
        var start = 0

        while (end >= 0) {
            if (end - start < 0 || s[end - start] == ' ') {
                if (start == 0) {
                    end--
                } else {
                    if (resultInd > 0) {
                        result[resultInd++] = ' '
                    }
                    for (k in end - start + 1 .. end) {
                        result[resultInd++] = s[k]
                    }
                    end = end - start - 1
                    start = 0
                }
            } else {
                start++
            }
        }

        val trimmedResult = CharArray(resultInd)
        for (i in trimmedResult.indices) {
            trimmedResult[i] = result[i]
        }

        return String(trimmedResult)
    }
}