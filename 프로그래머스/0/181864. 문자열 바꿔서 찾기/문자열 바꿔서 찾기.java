class Solution {
    public int solution(String myString, String pat) {
        StringBuilder flipped = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if ( c=='A') flipped.append('B');
            else flipped.append('A');
            
        }
        
        return flipped.toString().contains(pat) ? 1:0;
    }
}