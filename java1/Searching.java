import java.util.*;

public class Searching {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size;

    System.out.println("ENTER TOTAL NUMBER OF ELEMENTS");
    size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("ENTER " + size + " NUMBERS");

    for(int i =0; i < size; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("SELECT OPTION");
    System.out.println("1. SEQUENTIAL SEARCH");
    System.out.println("2. BINARY SEARCH");
  
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("SEQUENTIAL SEARCH");
        System.out.println("ENTER THE ELEMENT TO SEARCH");
        int target = sc.nextInt();

        int linearSearchIndex = linearSearch(arr, target);
        int position = linearSearchIndex + 1;

        if (linearSearchIndex != -1) {
          System.out.println("THE ELEMENT " + target + " IS FOUND IN " + position + " POSITION");
        } else {
          System.out.println("ELEMENT NOT FOUND");
        }
        break;

      case 2:
        System.out.println("BINARY SEARCH");
        binarySearch(arr);
        break;
        
      default:
        System.out.println("Invalid choice");
    }
    sc.close();
  }

  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static void binarySearch(int[] arr) {

    Scanner sc = new Scanner(System.in);

    System.out.println("THE SORTED ELEMENTS ARE");
    for(int i = 0; i < arr.length;i++){
      for(int j = 0;j < arr.length - i - 1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    int left = 0;
    int right = arr.length - 1;
    int middle = left + (right - left) / 2;

    System.out.println("THE MIDDLE ELEMENT IS " + arr[middle]);
    int target;
    System.out.println("ENTER THE ELEMENT TO SEARCH");
    target = sc.nextInt();
    binary(left, right, arr, target);
    sc.close();

}

  public static void binary(int left, int right, int[] arr, int target) {
  
  int originalMid = (left + right) / 2;
  boolean found = false;

  while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
          found = true;
          int position_1 = mid + 1;
          System.out.println("THE ELEMENT " + target + " FOUND AT POSITION " + position_1);
          if (mid < originalMid) {
              System.out.println("THE ELEMENT " + target + " IS PRESENT TO THE LEFT OF MIDDLE ELEMENT");
          } else if (mid > originalMid) {
              System.out.println("THE ELEMENT " + target + " IS PRESENT TO THE RIGHT OF MIDDLE ELEMENT");
          } else {
              System.out.println("THE ELEMENT IS FOUND AT THE ORIGINAL MIDDLE.");
          }

          int temp = mid - 1;
          while (temp >= 0 && arr[temp] == target) {
            int position = temp + 1;
              System.out.println("THE ELEMENT " + target + " ALSO FOUND AT POSITION " + position);
              temp--;
          }

          temp = mid + 1;
          while (temp < arr.length && arr[temp] == target) {
            int position = temp + 1;
              System.out.println("THE ELEMENT " + target + " ALSO FOUND AT POSITION " + position);
              temp++;
          }
          return;
      }
      else if (arr[mid] < target) {
          left = mid + 1;
      } 
      else {
          right = mid - 1;
      }
  }

  if (!found) {
      System.out.println("Target element " + target + " not found.");
  }
}

}



