package My_practice;

public class IDontcare {
    public static void main(String[] args) {
        for(int k=0; k<72; k++){ //for문에 2*1부터 9*9까지 72개 반복 수행위해 정수 변수 k에다가 초깃값 0부터 63까지 증감식 설정
            int i = k / 9 + 2; //현재 구구단에 단을 계산하기 위해 정수 변수 i설정, k/9은 어느 단에 속하는 지 결정하고 0부터 시작이므로 +2해서 2단부터 설정
            int j = k % 9 + 1; //현재 단에서 곱해지는 수 계산하기 위해 정수 변수 j설정, k%9은 현재 단에서 몇번째 계산인지 결정하고 0부터 시작이므로 +1로 설정
            System.out.println(i + " * " + j + " = " + (i * j));//i와 j에 곱셈 결과를 포함하도록 출력
            if(j==9){//곱해지는 햇수가 9번이므로 조건식 설정
                System.out.println();//공백출력
            }
        }
    }
}
