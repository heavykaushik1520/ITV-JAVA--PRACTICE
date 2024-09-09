package IntelIJ.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {6, 0, 3, 5};

        int n = arr.length;

        int temp;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {  // Compare adjacent elements
                    // Swap if the current element is greater than the next
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
