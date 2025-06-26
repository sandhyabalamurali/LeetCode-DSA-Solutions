class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        int len = n.length();
        if(num<=10){
            return String.valueOf(num-1);
        }
        if(num==11){
            return "9";
        }
        long lefthalf=Long.parseLong(n.substring(0,(len+1)/2));
        long[] genp=new long[5];
        genp[0]=divide(lefthalf-1,len%2==0);
        genp[1]=divide(lefthalf,len%2==0);
        genp[2]=divide(lefthalf+1,len%2==0);
        genp[3]=(long)Math.pow(10,len-1)-1;
        genp[4]=(long)Math.pow(10,len)+1;
        long near=0;
        long min=Long.MAX_VALUE;
        for(long candidate : genp){
            if(candidate==num){
                continue;
            }
            long diff=Math.abs(candidate-num);
            if(diff<min ||(diff==min && candidate<near)){
                min=diff;
                near=candidate;
            }
        }
        return String.valueOf(near);
    }
    public long divide(long left,boolean even){
        long pal=left;
        if(!even){
            left/=10;
        }
        while(left>0){
            pal=pal*10+left%10;
            left/=10;
        }
        return pal;
    }
}