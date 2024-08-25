public class Q18 {

        public  static  void  main(String args[])
        {
            int i, j, row = 6;

            for (i = 1; i < row; i++)
            {
                for (j = row - i; j > 1; j--)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= 9; j= j+2)
                {

                    System.out.print(" *");
                }
                System.out.println();


            }
        }
}
