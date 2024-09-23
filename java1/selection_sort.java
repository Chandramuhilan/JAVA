import java.util.*;

public class selection_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("ENTER THE NUMBER OF ELEMENTS");
    size =sc.nextInt();
    int[] arr = new int[size];
    System.out.println("ENTER THE "+ size +" VALUES");
    for(int i = 0;i < size;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("ENTERED ELEMENTS ARE ");
    for(int i = 0; i < size;i++){
      System.out.print(arr[i] + "\t");
    }
    System.out.println();
    int n = arr.length;

    for (int i = 0; i < n-1; i++) {
        int min = i;
        for (int j = i+1; j < n; j++){
          if (arr[j] < arr[min]){
               min = j;
          }
        }
  
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

        System.out.println("END OF " + (i+1) + "ITERATION");
        for (int k = 0; k < n; k++)
            System.out.print(arr[k] + " ");
        System.out.println();
    }
    sc.close();
  }
}


