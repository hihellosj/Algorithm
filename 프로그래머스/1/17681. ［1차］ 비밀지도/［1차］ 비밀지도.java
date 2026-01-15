class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int merged = arr1[i] | arr2[i]; // 핵심
            String binary = String.format("%" + n + "s",
                    Integer.toBinaryString(merged)).replace(' ', '0');

            StringBuilder line = new StringBuilder();
            for (char c : binary.toCharArray()) {
                line.append(c == '1' ? '#' : ' ');
            }
            result[i] = line.toString();
        }
        return result;
    }
}
