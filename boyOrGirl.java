package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        for(char i : s.toCharArray()) set.add(i);

        if(set.size()%2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
