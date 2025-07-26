class Solution {
    public int addDigits(int num) {
        // int dup=num;
        if(num==0){
            return 0;
        }
        while(num>9){
            int temp=num%10;
            num/=10;
            num+=temp;
        }
        return num;
    }
}