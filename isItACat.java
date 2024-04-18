// LEFT TO DO

package CodeForces;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class isItACat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next().toLowerCase();
            if(sol(n, s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean sol(int n, String s){
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) set.add(c);
        if(set.size() == 4){
            if(set.contains('m') && set.contains('e') && set.contains('o') && set.contains('w')) return true;
        }
        return false;
    }
}
