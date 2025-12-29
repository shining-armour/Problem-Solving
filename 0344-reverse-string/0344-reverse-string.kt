class Solution {
    fun reverseString(s: CharArray): Unit {
        val stack = Stack<Char>()
        //val result = mutableListOf<Char>()
        
        for (ch in s) {
          stack.push(ch)
        }

       // No in-place reversal 
       //while (stack.isNotEmpty()) {
        //result.add(stack.pop())
       //}

       var i = 0
       while (stack.isNotEmpty()) {
           s[i] = stack.pop()  
           i++ 
        }
    }
}