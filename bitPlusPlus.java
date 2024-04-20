package CodeForces;

import java.util.Scanner;

public class bitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ops = sc.nextInt();
        String arr[] = new String[ops];
        for(int i = 0 ; i < ops; i++){
            arr[i] = sc.next();
        }
        int X = 0;
        for(int i = 0 ; i < ops; i++){
            String s = arr[i];
            if(s.equals("X++")) X++;
            else if(s.equals("++X")) ++X;
            else if(s.equals("X--")) X--;
            else --X;
        }
        System.out.println(X);
    }
}
