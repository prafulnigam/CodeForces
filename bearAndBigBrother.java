package CodeForces;

import java.util.Scanner;

public class bearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;

        while(limak <= bob){
            limak *= 3;
            bob *= 2;
            count += 1;
        }

        System.out.println(count);
    }
}
