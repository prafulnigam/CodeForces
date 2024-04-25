package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class horseShoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        for(int i = 0; i < 4; i++) arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        int ans = 0;
        for(int i : map.keySet()){
            ans += map.get(i) - 1;
        }

        System.out.println(ans);
    }
}
