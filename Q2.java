public class Q2 {

    // 2. Write a program to compute the factorial of the number 10.
    public  static  void main(String args[])
    {
        int fact = 1;

        for (int i = 10; i >= 1 ; i--)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of 10 : " + fact);
    }

}
