class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    count++;
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
}