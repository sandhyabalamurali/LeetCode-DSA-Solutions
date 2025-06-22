// Last updated: 6/22/2025, 11:02:30 AM
class Solution {
    public boolean hasMatch(String s, String p) {
        // first find for starting position in p;
        int a = p.indexOf("*");
        String prefix=p.substring(0,a);
        String suffix=p.substring(a+1);
        int i= s.indexOf(prefix);
        return i!=-1 && s.indexOf(suffix,i+prefix.length())!=-1;
    }
}