

public class BubbleSort {
  static void bubblesort(int[] a) {
      int n = a.length;
      for (int i = 0; i < n - 1; i++) {
          boolean flag = false;
          for (int j = 0; j < n - i - 1; j++) {
              if (a[j] > a[j + 1]) {
                  // Swap a[j] and a[j + 1]
                  int temp = a[j];
                  a[j] = a[j + 1];
                  a[j + 1] = temp;
                  flag = true;
              }
          }
          // If no elements were swapped, the array is already sorted
          if (!flag) {
              break;
          }
      }
  }

  public static void main(String[] args) {
      int[] a = {1, 3, 6, 2, 23, 12, 11, 10};
      bubblesort(a);
      for (int i : a) {
          System.out.print(i + " ");
      }
  }
}
