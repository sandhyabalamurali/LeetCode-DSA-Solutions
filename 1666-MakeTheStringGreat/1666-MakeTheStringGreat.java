// Last updated: 6/22/2025, 11:03:08 AM
class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        char[] arr = s.toCharArray();
        for(int i=1; i<n ;i++){
            if(!st.isEmpty() && (st.peek()-arr[i]==32 || st.peek()-arr[i]==-32)){
                st.pop();
            }else{
                st.push(arr[i]);
            }
            
        }
        String ans = "";
        while(!st.empty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}