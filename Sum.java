
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in); 
        System.err.print("Enter first number: ");
        int x = num1.nextInt();
        System.err.print("Enter second number: ");
        int y = num1.nextInt();
        int sum = x+y;
        System.err.println("The sum is "+ sum);
        
    }
}