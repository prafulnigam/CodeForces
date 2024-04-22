package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class codeforcesChecking {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.addAll(Arrays.asList("c","o","d","e","f","o","r","c","e","s"));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            String c = sc.next();
            if(l.contains(c)) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}
