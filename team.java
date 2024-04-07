package CodeForces;

import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][3];

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < 3; j++) arr[i][j] = sc.nextInt();
        }

        int count = 0, ans = 0;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 1) count++;
            }
            if(count >= 2) ans++;
        }

        System.out.println(ans);
    }
}
