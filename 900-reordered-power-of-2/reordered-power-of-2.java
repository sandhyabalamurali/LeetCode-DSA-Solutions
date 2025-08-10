class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target=sort(n);
        for(int i=0;i<31;i++){
            if(sort(1<<i).equals(target)){
                return true;
            }
        }
        return false;
    }
    public String sort(int n){
        char[] arr=Integer.toString(n).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}