class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sh = HashMap<Char, Int>()
        val th = HashMap<Char, Int>()
        for(i in s){
            sh[i] = (sh[i] ?: 0) + 1
        }
        for(i in t){
            th[i] = (th[i] ?: 0) + 1
        }
        return sh==th
    }
}