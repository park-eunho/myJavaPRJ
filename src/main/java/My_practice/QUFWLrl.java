package My_practice;

public class QUFWLrl {
    public static void main(String[] args) {

        for(int i=0; i<4; i++){
            for(int j=3-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
