public class Q10 {
    //10. Write a program to print all even numbers between 1 and 50.
    public  static  void  main(String args[])
    {
        System.out.println("Even numbers in 1 to 50 : " );

        for (int i = 1; i <= 50 ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }

}
