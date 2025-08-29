class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length()<7){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b' || text.charAt(i)=='a' || text.charAt(i)=='l' || text.charAt(i)=='l' || text.charAt(i)=='o'|| text.charAt(i)=='o'|| text.charAt(i)=='n'){
                map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }
        System.out.print(map);
        int countB = map.getOrDefault('b',0);
        int countA = map.getOrDefault('a',0);
        int countL = map.getOrDefault('l',0)/2;
        int countO = map.getOrDefault('o',0)/2;
        int countN = map.getOrDefault('n',0);
        int maxBalloons = Math.min(countB, Math.min(countA, Math.min(countL, Math.min(countO, countN))));
        return maxBalloons;
        
    }
}