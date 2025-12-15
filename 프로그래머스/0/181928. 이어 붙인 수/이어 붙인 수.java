class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for (int num : num_list) {
            if(num % 2 == 1) {
                odd.append(num);
            } else {
                even.append(num);
            }
        }
        
        int oddNum = Integer.parseInt(odd.toString());
        int evenNum = Integer.parseInt(even.toString());
        
        return oddNum + evenNum;
        
    }
}