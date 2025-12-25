class Solution {
    public int[] solution(String my_string) {
        int[] cnt = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                cnt[c - 'A']++;
            } else { // 'a' ~ 'z'
                cnt[c - 'a' + 26]++;
            }
        }
        return cnt;
    }
}
