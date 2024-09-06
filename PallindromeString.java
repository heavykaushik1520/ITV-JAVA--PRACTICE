public class PallindromeString {
    static  boolean isPallindrome(String str)
    {
        int start = 0 ;
        int end = str.length()-1;

        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end) )
            {
                return  false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "kaushik";
        String str2 = "naman";

        System.out.println(str + " is Pallidrome : " + isPallindrome(str) );
        System.out.println(str2 + " is Pallidrome : " + isPallindrome(str2) );



    }
}
