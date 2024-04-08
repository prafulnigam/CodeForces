package CodeForces;

import java.util.*;

public class helpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(arr[i] == '+') continue;
            sb.append(arr[i]);
            if(i != s.length() - 1) sb.append("+");
        }
        System.out.println(sb);
    }
}
