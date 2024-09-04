package IntelIJ.pattern.src;

public class Pattern1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7 ; i++)
        {
            int result = (i <= 4 )? i : 8-i;
            for (int k = 4-result; k >= 1 ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= result ; j++) {

                System.out.print("*");

            }

            System.out.println();
        }
    }
}
