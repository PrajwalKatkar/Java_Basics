
import java.util.Scanner;

public class Occurence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int target = in.nextInt();
        int count = 0;
        while(num>0){
            int last = num%10;
            num/=10;
            if (target==last){
                count++;
            }
        }
        System.out.println(count);
    }
}