package exception;

public class ThrowAndThrows {

    public void div(int x , int y)throws ArithmeticException
    {
        System.out.println(x/y);
    }


    public static void main(String[] args) {

        ThrowAndThrows tt = new ThrowAndThrows();

        try{
            tt.div(10 , 0);
        } catch (ArithmeticException e) {
            System.out.println("hadnled by me");
        }


    }
}
