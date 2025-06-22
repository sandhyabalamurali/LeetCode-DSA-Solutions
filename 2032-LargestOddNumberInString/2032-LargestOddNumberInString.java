// Last updated: 6/22/2025, 11:03:00 AM
class Solution {
    public String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int number=num.length()-1;
        for(int i=number;i>=0;i--){
            char s=num.charAt(i);
            if(s%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}