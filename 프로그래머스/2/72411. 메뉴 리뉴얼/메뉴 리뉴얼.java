import java.util.*;

class Solution {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;
    
    public String[] solution(String[] orders, int[] course) {
        courseMap = new HashMap<>();
        for (int i : course){
            courseMap.put(i, new HashMap<>());
        }
        
        for(String order : orders) {
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            combinations(0, orderArray, "" );
        }

        ArrayList<String> answer = new ArrayList<>();
        
        // for (HashMap<String, Integer> count : courseMap.values()) {
        //     count.values().stream().max(Comparator.comparingInt(o->o))
        //         .ifPresent(cnt -> count.entrySet().stream()
        //                   .filter(entry -> cnt.equals(entry.getValue()) && cnt > 1)
        //                   .forEach(entry->answer.add(entry.getKey())));
        // }
        
        for (HashMap<String, Integer> count : courseMap.values()) {
            int max = 0;

            // 가장 많이 나온 횟수 찾기
            for (int value : count.values()) {
                if (value > max) {
                    max = value;
                }
            }

            // 최대 횟수이고, 2회 이상인 조합만 정답에 추가
            for (Map.Entry<String, Integer> entry : count.entrySet()) {
                if (entry.getValue() == max && max > 1) {
                    answer.add(entry.getKey());
                }
            }
        }
        
        
        Collections.sort(answer);
        return answer.toArray(new String[0]);
        
    }
    
    public static void combinations(int idx, char[] order, String result) {
        if (courseMap.containsKey(result.length())) {
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) +1);
        }
        for ( int i = idx; i < order.length; i++) {
            combinations(i + 1, order, result + order[i]);
        }
    }
}