class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] skipCheck = new boolean[26];
        
        for(char c : skip.toCharArray()){
            skipCheck[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            int cur = c - 'a';
            int count = 0;
            while (count < index) {
                cur = (cur + 1 ) % 26;
                if(skipCheck[cur]) continue;
                count++;
            }
            sb.append((char) (cur + 'a'));
            
        }
        return sb.toString();
    }
}