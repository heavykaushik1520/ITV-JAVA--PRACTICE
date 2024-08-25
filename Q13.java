/*
    1
    2*2
    3*3*3
    4*4*4*4
    5*5*5*5*5
    5*5*5*5*5
    4*4*4*4
    3*3*3
    2*2
    1
*/

public class Q13 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int z = (i <= 5) ? i : 11 - i;

            for (int j = 1; j <= z; j++)
            {
                System.out.print(z);
                if (j < z)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

