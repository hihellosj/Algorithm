import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;
        
        Set<Integer> winSet = new HashSet<>();
        for(int n : win_nums) winSet.add(n);
        
        for(int n : lottos) {
            if(n == 0) zeroCnt++;
            else if (winSet.contains(n)) matchCnt++;
        }
        int maxMatch = matchCnt + zeroCnt;
        int minMatch = matchCnt;
        
        return new int[] {
            getRank(maxMatch),
            getRank(minMatch)
        };
    }
    private int getRank(int cnt) {
        int rank = 7-cnt;
        return rank > 6 ? 6 : rank;
    }
}