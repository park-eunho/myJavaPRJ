package My_practice;

import java.util.Scanner;

public class Modeda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(); int b= s.nextInt(); int hap=0;

        if(a>b){
            for(int i=a; i>=b; i--){
                if(i%2!=0){
                    hap +=i;
                }
            }
        } else if (a<b) {
            for(int i=a; i<=b; i++){
                if(i%2!=0){
                    hap +=i;
                }
            }
        } else {
            System.out.println("두수가 같습니다.");
        }
        System.out.println(a+"에서 "+b+"까지 홀수의 합 : "+hap);
    }
}
