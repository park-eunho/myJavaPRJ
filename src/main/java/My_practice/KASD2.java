package My_practice;

public class KASD2 {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){ //for문에 정수 변수 i에 초깃값 0부터 3까지 증가 설정
            for(int j=0; j<3-i; j++){ //for문에 공백을 위해 정수 변수 j에 초기값 0부터 3-i까지 증가 설정
                System.out.print(" "); //공백 출력
            }
            for(int j=0; j<2*i+1; j++){ //for문에 홀수 출력하기 위해 정수 변수 j에 초깃값0부터
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
