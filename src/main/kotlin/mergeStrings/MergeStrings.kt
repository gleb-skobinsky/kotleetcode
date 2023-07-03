package mergeStrings

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var output = ""
        var i = 0
        while (i < word1.length || i < word2.length) {
            if (i < word1.length) {
                output += word1[i]
            }
            if (i < word2.length) {
                output += word2[i]
            }
            i++
        }
        return output
    }
}