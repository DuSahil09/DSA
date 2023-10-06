public class InsertionSort {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > i && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[i];
                arr[i] = temp;
                j--;
            }
        }
    }
}
