package CodeForces;

import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(i == 0) c = Character.toUpperCase(c);
            ans += c;
        }


        System.out.println(ans);

    }
}
