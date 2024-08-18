public class Frequency {

    public static void main(String args[])
    {
        int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        int fr[] = new int[arr.length];
        int visited = -1;

        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited; // Mark as visited
                }
            }
            if(fr[i] != visited) {
                fr[i] = count; // Store frequency
            }
        }

        // Displaying the frequency of each element
        System.out.println("Element | Frequency");
        for(int k = 0; k < fr.length; k++) {
            if(fr[k] != visited) {
                System.out.println("   " + arr[k] + "    |    " + fr[k]);
            }
        }
    }
}
