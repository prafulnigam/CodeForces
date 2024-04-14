package CodeForces;

import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ptr = 5, c = 0, idx = 0;
        int n = sc.nextInt();
        while(idx != n){
            while(idx + ptr > n) ptr--;
            idx += ptr;
            c++;
        }
        System.out.println(c);
    }
}
