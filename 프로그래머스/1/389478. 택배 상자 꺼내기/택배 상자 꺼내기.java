class Solution {
    public int solution(int n, int w, int num) {
       
   int rows = (n + w - 1) / w;
    int[][] box = new int[rows][w];

    int number = 1;

    for (int r = 0; r < rows; r++) {
        if (r % 2 == 0) {
            // 왼 -> 오른
            for (int c = 0; c < w && number <= n; c++) {
                box[r][c] = number++;
            }
        } else {
            // 오른 -> 왼
            for (int c = w - 1; c >= 0 && number <= n; c--) {
                box[r][c] = number++;
            }
        }
    }

    // num 위치 찾기
    int targetRow = 0, targetCol = 0;

    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < w; c++) {
            if (box[r][c] == num) {
                targetRow = r;
                targetCol = c;
            }
        }
    }

    // 위에 있는 상자 개수 세기
    int count = 0;
    for (int r = targetRow; r < rows; r++) {
        if (box[r][targetCol] != 0) count++;
    }

        
        return count;
    }
}