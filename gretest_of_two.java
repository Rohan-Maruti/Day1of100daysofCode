import java.util.*;

import javax.swing.text.Style;

class gretest_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("The value of a is " + a + " greater");
            } else {
                System.out.println("The value of c is " + c + " greater");
            }
        } else {
            if (b > c) {
                System.out.println("The value of b is " + b + " greater");
            } else {
                System.out.println("The value of c is " + c + " greater");
            }
        }

    }
}