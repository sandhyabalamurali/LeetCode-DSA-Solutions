class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxd=1;
        int maxa=1;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int dia=(l*l + w*w);
            int are=l*w;
            if(dia>maxd || (are>maxa && dia==maxd)){
                maxd=dia;
                maxa=are;
            }
        }
        return maxa;
    }
}