package My_practice;

import java.util.Scanner;

public class Baek2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println((a%4==0)?((a%400==0)?"1":(a%100==0)?"0":"1"):"0");
    }
}
