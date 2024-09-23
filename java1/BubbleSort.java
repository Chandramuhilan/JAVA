import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size;

    System.out.println("ENTER THE TOTAL NUMBER OF ELEMENTS :");
    size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("ENTER THE "+size+ " VALUES");

    for(int i = 0; i< arr.length;i++){
      arr[i] = sc.nextInt();
    }
    bubbleSort(arr);
    sc.close();
  }

  public static void bubbleSort(int[] arr) {
      int n = arr.length;
      boolean swapped;

      for (int i = 0; i < n - 1; i++) {
          System.out.println("ITERATION " + (i + 1));

          swapped = false;

          for (int j = 0; j < n - i - 1; j++) {
              
              if (arr[j] > arr[j + 1]) {
                  
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swapped = true;
              }
        
              printArray(arr);
          }

          if (!swapped) break;
      }
  }

  public static void printArray(int[] arr) {
      for (int i : arr) {
          System.out.print(i + " ");
      }
      System.out.println();
  }

}
