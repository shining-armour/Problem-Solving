class Solution {
    fun isPalindrome(s: String): Boolean {
        val rawStr = StringBuilder()
        for(i in s){
            if(i.isLetterOrDigit()){
                rawStr.append(i.lowercaseChar())
            }
        }
        return rawStr.toString() == rawStr.toString().reversed()
    }
}