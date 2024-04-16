package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class spellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            sol(s);
        }
    }
    public static void sol(String s){
        String orgString = "Timur";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> org = new HashMap<>();

        for(char c : orgString.toCharArray()) org.put(c, org.getOrDefault(c, 0) + 1);
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        if(map.equals(org)) System.out.println("YES");
        else System.out.println("NO");
    }
}
