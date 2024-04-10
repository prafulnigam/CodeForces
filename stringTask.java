package CodeForces;

import java.util.Scanner;

public class stringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') continue;
            else{
                sb = sb.append(".");
                sb = sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
