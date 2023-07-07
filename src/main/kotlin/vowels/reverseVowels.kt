package vowels

class Solution {
    private val vowels = setOf('a', 'e', 'i', 'o', 'u')
    private fun Char.isVowel() = this.toLowerCase() in vowels

    fun reverseVowels(string: String): String {
        val output = StringBuilder(string)
        val vowelPositions = string.indices.filter {
            string[it].isVowel()
        }
        for (i in vowelPositions.indices) {
            val pos = vowelPositions[i]
            val opPos = vowelPositions[vowelPositions.size - 1 - i]
            output[pos] = string[opPos]
        }
        return output.toString()
    }

    private fun Char.isVowel2() = when (this) {
        'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true
        else -> false
    }

    fun reverseVowels2(s: String): String {
        var start = 0
        var end = s.length - 1
        val arr = s.toCharArray()
        var temp: Char
        while (start < end) {
            if (arr[start].isVowel2() && arr[end].isVowel2()) {
                temp = arr[start]
                arr[start] = arr[end]
                arr[end] = temp
                start++
                end--
            }

            while (start < arr.size && !arr[start].isVowel2()) {
                start++
            }
            while (end > -1 && !arr[end].isVowel2()) {
                end--
            }
        }
        return String(arr)
    }
}