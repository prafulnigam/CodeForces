package CodeForces;
import java.util.*;
public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int count = 0, maxi = 0;
            for(int i = 0 ; i < n; i++) arr[i] = sc.nextInt();
            for(int i : arr){
                if(i == 0) count++;

                if(i != 0){
                    maxi = Math.max(count, maxi);
                    count = 0;
                }

            }
            maxi = Math.max(count, maxi);
            System.out.println(maxi);
        }

    }
}
