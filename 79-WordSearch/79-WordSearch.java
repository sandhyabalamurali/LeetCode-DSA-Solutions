// Last updated: 6/22/2025, 11:05:07 AM
class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) && search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board,String word,int i, int j,int count){
        // System.out.println("Visiting: (" + i + ", " + j + "), count = " + count);
        if(count==word.length()){
            return true;
        }
        if(i<0 || i>=board.length ||j<0 || j>=board[0].length || board[i][j]!=word.charAt(count)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found = search(board,word,i+1,j,count+1) ||
                        search(board,word,i-1,j,count+1) || 
                        search(board,word,i,j+1,count+1) || 
                        search(board,word,i,j-1,count+1);
        board[i][j]=temp;
        //   if (found) {
        // System.out.println("Path found through: (" + i + ", " + j + ")");
    // }
        return found;
        

    }
}