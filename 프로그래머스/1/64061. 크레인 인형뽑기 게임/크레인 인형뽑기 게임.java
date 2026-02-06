import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int removed = 0;
        
        int n = board.length;
        
        for(int move : moves) {
            int col = move -1;
            
            for (int row = 0; row < n; row++) {
                if(board[row][col] != 0) {
                    int doll = board[row][col];
                    board[row][col] = 0;
                    
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        removed += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        return removed;
    }
}