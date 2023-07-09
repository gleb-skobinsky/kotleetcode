package product

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        var n = 1
        for (i in nums.indices) {
            ans[i] = n
            n *= nums[i]
        }
        n = 1
        for (i in nums.size - 1 downTo 0) {
            ans[i] = n * ans[i]
            n *= nums[i]
        }
        return ans
    }
}