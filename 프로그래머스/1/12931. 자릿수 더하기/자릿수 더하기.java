import java.util.*;

public class Solution {
    public int solution(int n) {
       
        int sum = 0;
        while(n>0){
            int a = n % 10;
            sum += a;
            n /= 10;
        }

        return sum;
    }
}