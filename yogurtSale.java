package CodeForces;

import java.util.Scanner;

public class yogurtSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int q = sc.nextInt();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            sol(q, p1, p2);
        }
    }
    public static void sol(int q, int p1, int p2){
        int priceForTwoP1 = p1*2;

        if(priceForTwoP1 > p2){
            int cnt = 0;
            while(cnt < q) cnt = cnt + 2;
            if(cnt > q) cnt = cnt - 2;
            int buyAtP2 = (cnt/2) * p2;
            int buyAtP1 = (q - cnt) * p1;
            System.out.println(buyAtP1 + buyAtP2);
        }
        else {
            System.out.println(q*p1);
        }

    }
}
