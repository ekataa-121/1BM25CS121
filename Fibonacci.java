import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
               if (terms <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int firstTerm = 0;
            int secondTerm = 1;
            
            System.out.println("Fibonacci Series up to " + terms + " terms:");
            
            for (int i = 1; i <= terms; i++) {
                System.out.print(firstTerm + " ");
               	int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        
    }
}
