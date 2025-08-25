class Solution {
    public int appendCharacters(String s, String t) {
        // HashSet<Character> list=new HashSet<>();
        int i=0,j=0;
        int ans=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                // list.add(s.charAt(j));
                j++;
            }
            i++;
        }
        // System.out.print(list);
        return t.length()-j;
    }
}