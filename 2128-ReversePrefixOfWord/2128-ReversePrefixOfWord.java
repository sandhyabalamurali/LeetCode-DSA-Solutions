// Last updated: 6/22/2025, 11:02:57 AM
import java.util.Stack;

class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder rev = new StringBuilder();
        boolean found = false;
        
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            stack.push(a);
            
            if (a == ch) {
                found = true;
                break;
            }
        }
        
        if (!found) {
            return word;
        }
        
        while (!stack.isEmpty()) {
            rev.append(stack.pop());
        }
        
        rev.append(word.substring(rev.length(), word.length()));
        
        return rev.toString();
    }
}







// for(int i=0;i<word.length();i++){
        //     char a=word.charAt(i);
        //     // if(a!=ch){
        //     //     return word;
        //     // }
        //     if (a==ch){
        //         String p=word.substring(0,i+1);
        //         String rp=new StringBuilder(p).reverse().toString();
        //         return rp+word.substring(i+1);

        //     }
        // }
        // return word;