// Last updated: 6/22/2025, 11:05:23 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> ans=new HashMap<>();
         //System.out.println(ans);
         for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
         // System.out.print(key);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
              //  System.out.println(ans);
            }
            ans.get(key).add(s);
         }
         return new ArrayList<>(ans.values());
    }
}