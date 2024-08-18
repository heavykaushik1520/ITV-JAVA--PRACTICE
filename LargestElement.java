public class LargestElement {
    public static void main(String args[])
    {
        int arr[] = {2 , 5 , 1 , 8 , 3};
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }

        System.out.println("Maximum Element is : "+ max);

    }




}
