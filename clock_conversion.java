package CodeForces;

import java.util.Scanner;

public class clock_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            String s = sc.next();
            sol(s);
        }
    }
    public static void sol(String s){
        String arr[] = s.split(":");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        boolean isNight = false;
        if(hour >= 12){
            isNight = true;
            hour = hour - 12;
        }
        if(hour == 0){
            hour = 12;
        }

        String hr = Integer.toString(hour);
        String min = Integer.toString(minute);

        if(hr.length() == 1) hr = "0"+hr;
        if(min.length() == 1) min = "0"+min;

        if(isNight){
            System.out.println(hr +":"+min+" PM");
        }
        else System.out.println(hr +":"+min+" AM");
    }
}


