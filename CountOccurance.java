public class CountOccurance {

    public  static  void main(String args[])
    {
        int[] arr = {1, 2, 3, 2, 4, 2};

        int x = 2;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++; // Increment count if element matches x
            }
        }
        System.out.println(x + " occurs " + count + " times.");

    }

}
