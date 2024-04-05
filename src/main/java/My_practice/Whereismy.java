package My_practice;

import java.util.Scanner;

public class Whereismy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a%3==0) {
            System.out.println("3의 배수입니다.");
        } else if (a%7==0) {
            System.out.println("7의 배수입니다.");

        } else {
            System.out.println("3의 배수 7의 배수도 아닙니다.");
        }
    }
}
