class Solution {
    public int totalFruit(int[] fruits) {
        // Arrays.sort(fruits); //[0,1,2,2]
        // int count=0;
        int max=0;
        int r=0;
        int l=0;
        List<Integer> basket=new ArrayList<>();
        while(r<fruits.length){
            if(!basket.contains(fruits[r])){
                basket.add(fruits[r]);
            }
            while(basket.size()>2){
                int left=fruits[l];
                boolean check=false;
            for(int i=l+1;i<=r;i++) {
                if(fruits[i]==left) {
                    check=true;
                    break;
                }
            }
            if(!check) {
                 basket.remove(Integer.valueOf(left));
            }
            l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}