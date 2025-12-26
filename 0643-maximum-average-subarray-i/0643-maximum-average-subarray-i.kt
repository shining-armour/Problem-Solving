class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var start = 0
        var end = 0
        var subArraySum = 0.0
        var maxAvg = Double.NEGATIVE_INFINITY

        while(end < nums.size){

            subArraySum += nums[end]

            if(end - start + 1 < k){
                end++
            } else if(end - start + 1 == k) {
                val targetSizeSubArrayAvg =  subArraySum / k
                maxAvg = max(maxAvg, targetSizeSubArrayAvg)
                subArraySum -= nums[start]
                start++
                end++
            }
        }
        return maxAvg
    }
}