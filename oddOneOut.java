package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class oddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

            for(int i : map.keySet()){
                if(map.get(i) == 1) System.out.println(i);
            }
        }
    }
}
