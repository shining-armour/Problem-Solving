class Solution {
    fun arrangeCoins(n: Int): Int {
    if (n < 1) return 0
    val nl = n.toLong()
    return floor((-1 + sqrt(1.0 + 8.0 * nl)) / 2).toInt()
    }
}