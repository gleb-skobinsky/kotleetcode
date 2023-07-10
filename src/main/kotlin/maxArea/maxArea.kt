package maxArea

class Solution {
    fun maxArea(height: IntArray): Int {
        var start = 0
        var end = height.size - 1
        var max = 0
        while (end > start) {
            val height1 = height[start]
            val height2 = height[end]
            val water = height1.coerceAtMost(height2) * (end - start)
            if (water > max) {
                max = water
            }
            if (height1 < height2) {
                start++
            } else {
                end--
            }
        }
        return max
    }
}