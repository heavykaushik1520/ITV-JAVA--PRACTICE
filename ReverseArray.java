public class ReverseArray {

    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);

        System.out.println("Reversed Array : ");

        for(int data : arr)
        {
            System.out.println(data);
        }

    }

    public static void reverseArray(int[] arr) {
        int left = 0 ,right = arr.length-1;

        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }


}
