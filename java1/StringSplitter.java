import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        scanner.close();

        String modifiedSentence = sentence.replace(" ", "");
        for (int i = 0; i < modifiedSentence.length(); i += n) {
            if (i + n <= modifiedSentence.length()) {
                System.out.println(modifiedSentence.substring(i, i + n));
            } else {
                
                System.out.println(modifiedSentence.substring(i));
            }
        }
    }
}
