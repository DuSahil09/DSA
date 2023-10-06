// import java.util.*; it use when we take input from the user

// import java.util.Scanner;

public class SelectionSort {
  static void selection_sort(int arr[], int n) {
    for (int i = 0; i <= n - 1; i++) {
      int mini = i;
      for (int j = i + 1; j <= n - 1; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
      }
      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;
    }
    System.out.println("After selection sort");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    // To take array element from the user
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of elements: ");
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // System.out.println("Enter the elements:");
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    int n = arr.length;
    System.out.println("Before selection sort:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    selection_sort(arr, n);
    // sc.close();
  }

}