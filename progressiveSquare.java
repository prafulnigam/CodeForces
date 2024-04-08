package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class progressiveSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int arr[] = new int[n*n];
            for(int j = 0 ; j < n*n; j++) arr[j] = sc.nextInt();
            sol(n, c, d, arr);
        }
    }
    public static void sol(int n , int c, int d, int[] arr){
        // Finding The Minimum From the Arr
        Arrays.sort(arr);
        int mini = arr[0];

        // Making The Matrix
        int mat[][] = new int[n][n];
        mat[0][0] = mini;
        for(int col = 1 ; col < n; col++){
            mat[0][col] = mat[0][col-1] + c;
        }
        for(int row = 1; row < n; row++){
            mat[row][0] = mat[row - 1][0] + d;
        }
        for(int row = 1; row < n; row++){
            for(int col = 1; col < n; col++){
                mat[row][col] = mat[row][col - 1] + c;
            }
        }

        // Checking Both are Equal Or Not
        int newArr[] = new int[n*n];
        int cnt = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                newArr[cnt++] = mat[i][j];
            }
        }

        Arrays.sort(newArr);
        if(Arrays.equals(arr, newArr)) System.out.println("YES");
        else System.out.println("NO");

    }
}
