public class Q3 {
    // 3. Write a program to print all multiples of 7 between 1 and 100.
    public  static  void main(String args[])
    {
        System.out.print("Multiples of 7 are : ");
        for (int i = 1; i <= 100 ; i++)
        {
            if (i % 7 == 0)
            {
                System.out.print(i + " ");
            }
        }

    }
}
