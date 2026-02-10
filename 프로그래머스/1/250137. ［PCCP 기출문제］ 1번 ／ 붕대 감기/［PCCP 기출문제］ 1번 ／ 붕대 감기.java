class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int curHealth = health;
        int combo = 0;
        int attackIdx = 0;
        
        int lastTime = attacks[attacks.length - 1][0];
        
        for ( int time = 1; time <= lastTime; time++) {
            if (attackIdx < attacks.length & attacks[attackIdx][0] == time) {
                curHealth -= attacks[attackIdx][1];
                combo = 0;
                attackIdx++;
                
                if(curHealth <= 0) {
                    return -1;
                }
            }
            
            else {
                curHealth += x;
                combo++;
                
                if (combo == t) {
                    curHealth += y;
                    combo = 0;
                }
                if (curHealth > health) {
                    curHealth = health;
                }
            }
        }
        return curHealth;
    }
}