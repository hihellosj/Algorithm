import java.util.*;

class Solution {
    public int solution(int a, int b) {
        StringBuilder ab = new StringBuilder();
       
        
        ab.append(a);
        ab.append(b);
       
        return Math.max(Integer.parseInt(ab.toString()), 2*a*b);
        
        
    }
}