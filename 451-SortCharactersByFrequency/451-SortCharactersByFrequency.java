// Last updated: 6/22/2025, 11:03:54 AM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            int freq = map.get(c);
            for (int j = 0; j < freq; j++) {
                sb.append(c);
            }
        }

        return sb.toString();

    }
}