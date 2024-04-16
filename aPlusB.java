package CodeForces;

import java.util.Scanner;

public class aPlusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n; i++){
            String s = sc.next();
            char arr[] = s.toCharArray();
            int val1 = Integer.parseInt(String.valueOf(arr[0]));
            int val2 = Integer.parseInt(String.valueOf(arr[2]));
            System.out.println(val1 + val2);
        }


    }
}
