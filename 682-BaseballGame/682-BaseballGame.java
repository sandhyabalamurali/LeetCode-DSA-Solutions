// Last updated: 6/22/2025, 11:03:41 AM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int pop1;
        int pop2;
        for(String op:operations){
            if (op.equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if (op.equals("D")){
                if(!stack.isEmpty())
                    stack.push(2*stack.peek());

            }
            else if(op.equals("+")){
                int top=stack.pop();
                int newtop=top+stack.peek();
                stack.push(top); 
                stack.push(newtop);

            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans=ans+stack.pop();
        }
        return ans;

        
    }
}