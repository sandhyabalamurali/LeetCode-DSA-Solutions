class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> res=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            res.put(b,res.getOrDefault(b,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(res.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}