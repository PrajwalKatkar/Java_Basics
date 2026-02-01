public class arthemetic_operations_4{
    public static void main(String[] args) {
        int a =5;
        int b = 10;
        System.out.println(a+b); // addition
        System.out.println(a-b); // substraction
        System.out.println(a*b); // multiplication
        System.out.println(a/b); // gives quotient
        System.out.println(a%b); // gives remainder


        int y =10;
        // y = y+1;
        // y +=1;
        y++;  // all three are doing same thing 

        System.out.println(y);

        // now lets see pre increment and post increment

        int z= 2;
        int result = ++z;  // pre increment
        System.out.println(result); // result will be 3

        int x = 2;
        int res = x++;  // post increment
        System.out.print(res); // res will 2 it will not change 

    }
}