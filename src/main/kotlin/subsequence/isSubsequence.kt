package subsequence

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var count = 0
        var i = 0
        while (count < s.length && i < t.length) {
            val char = t[i]
            if (char == s[count]) {
                count++
            }
            i++
        }
        return s.length <= count
    }
}