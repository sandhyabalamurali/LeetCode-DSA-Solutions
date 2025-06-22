// Last updated: 6/22/2025, 11:04:38 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder res=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') continue;
            int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            res.append(s.substring(j + 1, i + 1)).append(" ");
            i = j;
        }
        return res.toString().trim();
    }
}