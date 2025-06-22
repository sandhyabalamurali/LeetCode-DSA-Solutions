// Last updated: 6/22/2025, 11:05:45 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String a=strs[0];
        String b=strs[n-1];
        StringBuilder res=new StringBuilder();
        int index=0;
        while(index<a.length() && index<b.length()){
            if(a.charAt(index)==b.charAt(index)){
                res.append(a.charAt(index));
                index++;
            }
            else{
                break;
            }
        }
        return res.toString();
    }
}