package flowers

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var placed = 0
        if (n == 0) return true
        if (flowerbed.size == 1) {
            return if (flowerbed[0] == 0) n == 1 else false
        }
        for (i in flowerbed.indices) {
            val place = flowerbed[i]
            when (i) {
                0 -> {
                    if (place == 0) {
                        val next = flowerbed.getOrNull(1)
                        if (next == 0) {
                            placed += 1
                            flowerbed[i] = 1
                        }
                    }
                }

                flowerbed.size - 1 -> {
                    if (place == 0) {
                        val previous = flowerbed.getOrNull(flowerbed.size - 2)
                        if (previous == 0) {
                            placed += 1
                            flowerbed[i] = 1
                        }
                    }
                }

                else -> {
                    if (place == 0) {
                        val next = flowerbed.getOrNull(i + 1)
                        val previous = flowerbed.getOrNull(i - 1)
                        if (previous == 0 && next == 0) {
                            placed += 1
                            flowerbed[i] = 1
                        }
                    }
                }
            }
            if (n <= placed) break
        }
        return n <= placed
    }

    fun canPlaceFlowers2(flowerbed: IntArray, n: Int): Boolean {
        var plots = n
        for (i in flowerbed.indices) {
            if (
                flowerbed[i] == 0
                && (i - 1 < 0 || flowerbed[i - 1] == 0)
                && (i + 1 == flowerbed.size || flowerbed[i + 1] == 0)
            ) {
                plots--
                flowerbed[i] = 1
            }
            if (plots <= 0) break
        }
        return plots <= 0
    }
}