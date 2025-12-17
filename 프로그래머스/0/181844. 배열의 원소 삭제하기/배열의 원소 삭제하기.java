import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> delSet = new HashSet<>();
        for(int n : delete_list){
            delSet.add(n);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for(int num : arr){
            if(!delSet.contains(num)){
                resultList.add(num);
                
            }
        }
        int[] result = new int[resultList.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}