public class Frequency {

    public static void main(String args[])
    {
        int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        // array frequencies will store frequency of element
//        int length = arr.length;

        int fr[] = new int[arr.length];

        int visited = -1;
        int i;
        int count = 1;

        for(i = 0 ; i < arr.length ; i++)
        {


            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }
        }

        if(fr[i] != visited)
        {
            fr[i] = count;
        }

        System.out.println("Elements Frequency : ");

        for(int k = 0 ; k < fr.length ; k++)
        {
            if (fr[i] != visited)
            {
                System.out.println(" " + arr[i] + " " + fr[k]);
            }
        }

    }

}
