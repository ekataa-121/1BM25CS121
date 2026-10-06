import java.util.Scanner;

public class SwapNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (A): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number (B): ");
        int b = scanner.nextInt();      
        System.out.println("\n--- Before Swapping ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
               a = a + b;  
       	       b = a - b;
               a = a - b;          
               System.out.println("\n--- After Swapping ---");
       	       System.out.println("A = " + a);
               System.out.println("B = " + b);
            }
}
