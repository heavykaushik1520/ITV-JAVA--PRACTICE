public class SecondLagest {

    public static  void main(String args[])
    {
        int[] arr = {5, 7, 2, 9, 3, 8};

        int max = arr[0];

        int secondMax = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];

            } else if (arr[i] > secondMax && arr[i] != max) {

                secondMax = arr[i];
                
            }
        }

        if (secondMax == max)
        {
            System.out.println("No distinct second largest element found.");
        }
        else
        {
            System.out.println("The second largest element is: " + secondMax);
        }

    }

}

