// Last updated: 6/22/2025, 11:05:16 AM
class Solution {
    public int lengthOfLastWord(String s) {
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         res.replace(0, res.length(), "");
        //     }
        //     else{
        //         res.append(s.charAt(i));
        //     }
        // }
        // return res.length();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                length++;
            }
            else if(ch==' ' && length>0){
                break;
            }
        }
        return length;
    }
}