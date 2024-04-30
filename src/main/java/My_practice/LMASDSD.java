package My_practice;

import java.util.Scanner;

public class LMASDSD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int min= 60 * a + b;
        min +=c;
        int hour = (min/60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
