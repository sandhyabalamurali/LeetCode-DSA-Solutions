// Last updated: 6/22/2025, 11:03:01 AM
class Solution {
    public int beautySum(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int frq:freq){
                    if(frq>0){
                        max=Math.max(max,frq);
                        min=Math.min(min,frq);
                    }
                }
                total+=(max-min);
            }
        }
        return total;
    }
}