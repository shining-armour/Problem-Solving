class Solution {
    fun isPalindrome(s: String): Boolean {
        val scpy = s.lowercase().filter { it.isLetterOrDigit() }
        var start = 0
        var end = scpy.length - 1
        while(start < end){
            if(scpy[start] != scpy[end]){
                return false
            }
            start++
            end--
        }
        return true
    }
}