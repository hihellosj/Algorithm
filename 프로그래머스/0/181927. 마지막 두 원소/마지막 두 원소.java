import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        
        int addValue = last > beforeLast ? last - beforeLast : last * 2;
        
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        result[result.length - 1] = addValue;
        
        return result;
    }
}