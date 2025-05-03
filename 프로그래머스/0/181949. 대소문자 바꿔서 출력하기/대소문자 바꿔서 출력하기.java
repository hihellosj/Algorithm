import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder s = new StringBuilder();
        
        for(char ch : a.toCharArray()){
            if(Character.isUpperCase(ch)){
                s.append(Character.toLowerCase(ch));
            }else{
                s.append(Character.toUpperCase(ch));
            }
        }
        System.out.print(s.toString());
    }
}