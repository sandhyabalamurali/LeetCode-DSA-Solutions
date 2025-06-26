class Solution {
    public HashSet<String> set;
    public HashMap<String,Boolean> memo;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        set=new HashSet<>(Arrays.asList(words));
        memo=new HashMap<>();
        ArrayList<String> res=new ArrayList<>();
        for(String c:words){
            if(isConcat(c)){
                res.add(c);
            }
        }
        return res;
    }
    public boolean isConcat(String words){
        if(memo.containsKey(words)){
            return memo.get(words);
        }
        for(int i=1;i<words.length();i++){
            String prefix=words.substring(0,i);
            String suffix=words.substring(i);
            if(set.contains(prefix)&&(set.contains(suffix) || isConcat(suffix))){
                memo.put(words,true);
                return true;
            }
        }
        memo.put(words,false);
            return false;

    }
}