package zeroes

class Solution {
    fun moveZeroes(nums: IntArray) {
        var count = 0
        for (i in nums.indices) {
            val num = nums[i]
            if (num != 0) {
                nums[count] = num
                count++
            }
        }
        for (i in count until nums.size) {
            nums[i] = 0
        }
    }
}