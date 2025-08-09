class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int max=1;
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<=s.length();j++){
                if(j-i>max && ispalindrome(s.substring(i,j))){
                    max=j-i;
                    maxstr=s.substring(i,j);
                }
            }
        }
        return maxstr;
    }
    public boolean ispalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}