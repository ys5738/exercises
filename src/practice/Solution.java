package practice;

import java.util.Stack;

public class Solution  {
    public int countBattleships(char[][] board) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] visted = new boolean[h][w];
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == 'X' && !visted[i][j]){
                    DFS(board, i, j, visted);
                    count++;   
                } 
            }
        }
        return count;
    }
    public void DFS(char[][] board, int i, int j, boolean[][] visted){
        Stack<Integer> s = new Stack<>();
        int width = board[0].length;
        int height = board.length;
        s.push(i*width+j);
        int j1, i1;
        while(!s.empty()){
            int n = s.peek();
            j1 = n%width;
            i1 = n/width;
            if(height > i1+1){
                if(board[i1+1][j1] =='X'&& !visted[i1+1][j1]){
                    s.push((i1+1)*width+j1);
                    visted[i1+1][j1] = true;
                    continue;                
                }
            }
            if(width > j1+1){
                if(board[i1][j1+1] =='X'&& !visted[i1][j1+1]){
                    s.push((i1)*width+j1+1);
                    visted[i1][j1+1] = true;
                    continue;            
                }
            }
            s.pop();
        }
        
    }
    public static void main(String[]args){
    	char[][] case1 = new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
    	System.out.println(new Solution().countBattleships(case1));
    	System.out.println(case1[2][3]);
    }
}