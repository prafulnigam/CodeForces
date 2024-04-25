package CodeForces;

import java.util.Scanner;

public class vanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();

        int width = 0;

        for(int i : arr){
            if(i > h) width += 2;
            else width += 1;
        }

        System.out.println(width);

    }
}
