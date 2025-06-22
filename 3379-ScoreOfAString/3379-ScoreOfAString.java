// Last updated: 6/22/2025, 11:02:34 AM
class Solution {
    public int scoreOfString(String s) {
        // char ch='\0';
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}