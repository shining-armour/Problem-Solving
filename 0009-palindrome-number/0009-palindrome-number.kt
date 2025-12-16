class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var reversed = ""
        for (i in str.length - 1 downTo 0) {
            reversed += str[i]
        }
        return str == reversed
    }
}
