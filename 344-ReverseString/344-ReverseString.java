// Last updated: 6/22/2025, 11:04:04 AM
class Solution {
    public void reverseString(char[] s) {
        int left=0; //0
        int right=s.length-1;  //4
        while(left<right){  
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}