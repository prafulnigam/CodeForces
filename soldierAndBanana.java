package CodeForces;

import java.util.Scanner;

public class soldierAndBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costOfFirst = sc.nextInt();
        int money = sc.nextInt();
        int banana = sc.nextInt();

        int totalCost = 0;
        for(int i = 1 ; i <= banana; i++){
            totalCost += i * costOfFirst;
        }

        int req = totalCost - money;
        if(req < 0) System.out.println(0);
        else System.out.println(req);
    }
}
