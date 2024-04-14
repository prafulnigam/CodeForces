package CodeForces;

import java.util.Scanner;

public class stonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        int c = 0;

        for(int i = 0 ; i < arr.length - 1;  i++){
            if(arr[i] == arr[i + 1]) c++;
        }

        System.out.println(c);

    }
}
