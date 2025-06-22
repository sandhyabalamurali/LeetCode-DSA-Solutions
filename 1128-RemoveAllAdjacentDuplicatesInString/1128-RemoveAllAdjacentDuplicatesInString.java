// Last updated: 6/22/2025, 11:03:20 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char fs=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(fs);
            }
            else{
                if(stack.peek()==fs){
                    stack.pop();
                }
                else{
                    stack.push(fs);
                }
            }
        }
        String result ="";
        for(char ch : stack)
        {
            result += ch;
        }
        return result;
    }
}