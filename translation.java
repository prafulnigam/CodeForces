package CodeForces;

import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        sb1 = sb1.reverse();

        if (sb1.toString().equals(sb2.toString())) System.out.println("YES");
        else System.out.println("NO");
    }
}
