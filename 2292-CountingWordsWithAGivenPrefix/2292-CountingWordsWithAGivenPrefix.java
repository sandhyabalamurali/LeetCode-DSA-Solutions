// Last updated: 6/22/2025, 11:02:53 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(pref))
                count++;
        }
        return count;
    }
}