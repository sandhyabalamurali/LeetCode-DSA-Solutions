class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String str:dictionary){
            if(isSubsequence(s,str)){
                if(str.length()>res.length() || 
                (str.length()==res.length() && str.compareTo(res)<0)){
                    res=str;
                }
            }
        }
        return res;
    }
    public boolean isSubsequence(String s,String word){
        int i=0;
        int j=0;
        if(word.length()>s.length()){
            return false;
        }
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return j==word.length();
    }
}