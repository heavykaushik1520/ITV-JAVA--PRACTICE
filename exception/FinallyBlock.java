package exception;

import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {


//        System.out.println(5 / 0);

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number : ");
            int x = sc.nextInt();
            System.out.println(5 / x);

        }
        catch (ArithmeticException e) {
            System.out.println("cant divide by zero");
        }
        finally {

            System.out.println("I am finally ");
        }
    }
}
