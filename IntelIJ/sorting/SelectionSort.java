package IntelIJ.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {10, 70, 30, 60, 50, 40};

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }


            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}
