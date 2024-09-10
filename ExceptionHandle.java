

import java.util.InputMismatchException;
import java.util.*;


public class ExceptionHandle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter First Number : ");
            int y= sc.nextInt();

            System.out.println("Enter Second NUmber : ");
            int x = sc.nextInt();
            System.out.println(x/y);

        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide any number by zero");

        }
        catch(InputMismatchException e)
        {
            System.out.println("Only integer type data");
        }

    }

}

