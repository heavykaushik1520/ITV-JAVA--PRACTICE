public class Qq {

    public  static void main(String[] args)
    {
        for(int i = 1 ; i <= 9 ; i++)
        {
            int result = (i <= 5) ? 6 - i : i-4;
            for (int j = result; j >= 1 ; j--) 
            {
                System.out.print("*");
            } 

            System.out.println();
        }
        
    }

}
