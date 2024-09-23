import java.util.Arrays;
import java.util.Collections;

public class CommandLineOperations {

    public static void main(String[] args) {
        
        Integer[] numbers = new Integer[args.length];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
    
                numbers[i] = Integer.parseInt(args[i]);
                sum += numbers[i];         
        }

        for(int i = 0; i < numbers.length;i++){
            for(int j = 0;j < numbers.length - i - 1; j++){
              if(numbers[j] > numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
              }
            }
          }
        System.out.println("Numbers in ascending order: ");
        for(int r : numbers){
            System.out.print(r + "\t");
        }
        System.out.println();
        
        System.out.println("Numbers in descending order: ");
        for(int i = numbers.length - 1;i>= 0 ;i--){
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
       
        System.out.println("Sum of numbers: " + sum);

  
        int max = Collections.max(Arrays.asList(numbers));
        int min = Collections.min(Arrays.asList(numbers));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
