package CodeForces;

import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hate = true;
        while(n > 0){
            if(n == 1 && hate == true){
                System.out.print("I hate it");
                return;
            }
            if(n == 1 && hate == false){
                System.out.print("I love it");
                return;
            }
            if(hate == true)System.out.print("I hate that ");
            if(hate == false) System.out.print("I love that ");

            hate = !hate;
            n--;

        }
    }
}
