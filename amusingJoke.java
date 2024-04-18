package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class amusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()) map1.put(c, map1.getOrDefault(c , 0) + 1);
        for(char c : s2.toCharArray()) map1.put(c, map1.getOrDefault(c , 0) + 1);
        for(char c : s3.toCharArray()) map2.put(c, map2.getOrDefault(c , 0) + 1);

        if(map1.equals(map2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
