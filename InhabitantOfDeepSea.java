package CodeForces;

import java.util.Scanner;

public class InhabitantOfDeepSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) arr[j] = sc.nextInt();
            sol(n, k, arr);
        }
    }

    public static void sol(int n, int k, int[] arr) {
        int direction = 1;
        for (int i = 0; i < k; i++) {
            if (direction == 1) { // FROM LEFT
                int ptr = 0;
                while (ptr < n && arr[ptr] == 0) ptr++;
                if(ptr < n) arr[ptr] = arr[ptr] - 1;
                direction = direction * -1; // Change The Direction
            } else {
                int ptr = n - 1;
                while (ptr >= 0 && arr[ptr] == 0) ptr--;
                if(ptr >= 0) arr[ptr] = arr[ptr] - 1;
                direction = direction * -1;
            }
        }
        int count = 0;
        for (int i : arr) {
            if (i == 0) count++;
        }
        System.out.println(count);
    }
}
