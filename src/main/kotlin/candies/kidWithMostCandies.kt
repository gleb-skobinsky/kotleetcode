package candies

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> = candies.map { candy ->
        val withExtra = candy + extraCandies
        candies.all { it <= withExtra }
    }

    fun kidsWithCandies2(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        return candies.map { it + extraCandies > max }
    }
}