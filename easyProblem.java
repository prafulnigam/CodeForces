package CodeForces;

import java.util.Scanner;

public class easyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();
        for(int i : arr){
            if(i == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
