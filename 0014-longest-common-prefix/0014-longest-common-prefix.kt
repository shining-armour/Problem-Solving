class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.size == 0) return ""
        var prefix = ""
        for(letterIndex in strs[0].indices){
            for (word in strs){
                if(letterIndex == word.length || word[letterIndex] != strs[0][letterIndex]){
                    return prefix
                }
            }
            prefix += strs[0][letterIndex]
        }
        return prefix
    }
}