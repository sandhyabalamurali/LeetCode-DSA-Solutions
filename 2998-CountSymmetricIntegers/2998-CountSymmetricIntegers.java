// Last updated: 6/22/2025, 11:02:40 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String a=Integer.toString(i);
            int l=a.length();
            if(l%2==0){
                int f=0,s=0,h=l/2;
                for(int j=0;j<h;j++){
                    f+=a.charAt(j)-'0';
                }
                for(int j=h;j<l;j++){
                    s+=a.charAt(j)-'0';
                }
                if(f==s){
                    count++;
                }
                
            }

            
        }
        return count;
    }
}