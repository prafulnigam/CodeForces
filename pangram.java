package CodeForces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine().toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if (map.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
