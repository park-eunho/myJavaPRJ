package class0318;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            if ( i <= 4) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
                else
                {
                    for ( int j = 0; j < 8 - i; j++) {
                        System.out.print("*");
                    }
                }
            System.out.println();
            }
        }
    }
