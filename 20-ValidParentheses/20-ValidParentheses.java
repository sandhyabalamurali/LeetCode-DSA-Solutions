// Last updated: 6/22/2025, 11:05:39 AM
class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack= new Stack<>();
    int ind;
    for(ind=0;ind<s.length();ind++){
        char curr=s.charAt(ind);
        if(curr=='(' || curr=='{' || curr=='['){
            stack.push(curr);
        }
        else if(curr==')' && !stack.empty() && stack.peek()=='('){
            stack.pop();
        }
        else if(curr=='}' && !stack.empty() && stack.peek()=='{'){
            stack.pop();
        }
        else if(curr==']' && !stack.empty() && stack.peek()=='['){
            stack.pop();
        }
        else{
            return false;
        }
    }
    return stack.isEmpty();
        
    }
}