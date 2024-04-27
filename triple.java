package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();

            if(n < 3){
                System.out.println("-1");
                continue;
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(arr);
            for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

            for(int i : map.keySet()){
                if(map.get(i) >= 3) list.add(i);
            }

            if(list.size() == 0){
                System.out.println("-1");
                continue;
            }
            System.out.println(list.get(list.size() - 1));
        }
    }
}
