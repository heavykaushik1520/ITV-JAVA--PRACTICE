public class Q4 {

    // 4. Write a program to reverse the digits of the number 1234. The output should be 4321.

    public  static  void main(String args[])
    {
        int number = 1234 , rem , sum = 0;
        System.out.println("Original Number : " + number);
        while(number > 0)
        {
            rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;

        }

        System.out.println("Reversed Number : " + sum);

    }

}
