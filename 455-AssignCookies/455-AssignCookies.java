// Last updated: 6/22/2025, 11:03:53 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while(l<s.length&&r<g.length){
            if(s[l]>=g[r]){
                r++;
            }
            l++;
        }
        return r;

        
    }
}