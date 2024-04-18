package CodeForces;

import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0){
            if(detect(n)) n = n / 10;
            else n = n - 1;
        }
        System.out.println(n);
    }

    public static boolean detect(int n){
        if(n%10 == 0) return true;
        return false;
    }
}
