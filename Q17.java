/*


 */

public class Q17 {

    public  static  void  main(String args[])
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int h = 1; h <= i ; h++)
            {
                System.out.print(" ");
            }

            for (int j = 5; j >= i ; j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
