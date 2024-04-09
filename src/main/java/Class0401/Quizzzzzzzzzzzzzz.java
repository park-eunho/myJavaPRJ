package Class0401;

import java.util.Scanner;

public class Quizzzzzzzzzzzzzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i < b + 1; i++) {
            System.out.println(i);
        }
        if (a > b) {
            for (int i = a; i > b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                } else {
                    for (int i = a; i < b; i++) {
                        if (i % 3 == 0) {
                            System.out.println(i);
                        }
                    }
                }

            }
        }
    }
}
