package CodeForces;

import java.util.Scanner;

public class stair_peak_neither {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int[] arr = new int[3];
            for(int i = 0 ; i < 3; i++) arr[i] = sc.nextInt();
            if(arr[0] < arr[1] && arr[1] < arr[2]) System.out.println("STAIR");
            else if(arr[0] < arr[1] && arr[1] > arr[2]) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}
