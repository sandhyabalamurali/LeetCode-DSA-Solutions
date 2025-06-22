// Last updated: 6/22/2025, 11:05:47 AM
class Solution {
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character,Integer> symbol=new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        for(int i=0;i<s.length()-1;i++){
            if(symbol.get(s.charAt(i))<symbol.get(s.charAt(i+1))){
                res=res-symbol.get(s.charAt(i));
            }
            else{
                res+=symbol.get(s.charAt(i));
            }
        }
        return res + symbol.get(s.charAt(s.length() - 1)); 
    }
}