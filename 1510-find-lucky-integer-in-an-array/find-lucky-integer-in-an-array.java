class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int l_num=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(key==val){
                if(key>l_num){
                    l_num=key;
                }
            }
        }
        return l_num;
    }
}