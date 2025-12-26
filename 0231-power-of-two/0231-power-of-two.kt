class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
    if (n <= 0) return false
    val y = log10(n.toDouble()) / log10(2.0)
    return y.toInt() % 2 == 0
    }
}