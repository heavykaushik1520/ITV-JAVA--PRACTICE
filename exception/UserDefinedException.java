package exception;

class InvalidException extends Exception {

    public InvalidException(String s) {

        super(s);
    }
}


public class UserDefinedException {

    public void checkAge(int age)  {
        try {
            if (age < 18) {
                throw new InvalidException("Age must be greater than 18");
            }
        } catch (InvalidException e) {

            System.out.println(e);
        }
    }


    public static void main(String[] args)
    {

        UserDefinedException ude = new UserDefinedException();

            ude.checkAge(10);



    }
}
