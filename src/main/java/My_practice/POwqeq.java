package My_practice;

import java.util.Scanner;

public class POwqeq {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();

            if(a%21==0){
                System.out.println("3의 배수 7의 배수 둘 다 만족합니다.");
            } else if (a%7==0) {
                System.out.println("7의 배수입니다.");

            } else if (a%3==0) {
                System.out.println("3의 배수입니다.");

            } else {
                System.out.println("3의 배수 5의 배수 둘 다 아닙니다."); //
            }
        }
    }



}
