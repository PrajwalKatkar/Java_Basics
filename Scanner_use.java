import java.util.Scanner;
public class Scanner_use{
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner input = new Scanner(System.in); 
        System.out.println(input.nextInt()); // this will take input as integer
        System.out.println("enter a string");
        System.out.println(input.next()); // this will take input as string and only the first word
        // System.out.println(input.nextLine()); // this will take input as  string  , whole line
    }
} 