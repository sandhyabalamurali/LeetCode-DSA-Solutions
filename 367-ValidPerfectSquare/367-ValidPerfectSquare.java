// Last updated: 6/22/2025, 11:04:01 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }
        int st=1,end=num;
        while(st<=end){
           int mid=(st+end)/2;  //8 //4
           long sq=(long)mid*mid;
           if(sq==num){ //8!=2 || 64!=16 //4*4=16
            return true;
           }
           else if (sq<num){ 
            st=mid+1;
           }
           else{ //8>2
            end=mid-1;  //7
           }
        }
        return false;
    }
}