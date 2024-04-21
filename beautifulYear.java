package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class beautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(sol(n + 1) != true){
            n = n + 1;
        }
        System.out.println(n + 1);

    }
    public static boolean sol(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n > 0){
            int rem = n % 10;
            set.add(rem);
            n = n / 10;
        }
        if(set.size() == 4) return true;
        else return false;
    }
}
