package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int arr[] = {n1, n2, n3};
            Arrays.sort(arr);
            if(arr[0] + arr[1] == arr[2]) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
