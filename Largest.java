import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        // int largest = a;
        // if(largest<b){
        //     largest=b;
        // }
        // if(largest<c){
        //     largest=c;
        // }
        // System.out.println(largest);

        // another method
        int max = Math.max(c,Math.max(a, b));
        System.out.print(max);
    }
}