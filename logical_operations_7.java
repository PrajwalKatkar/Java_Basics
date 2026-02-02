public class logical_operations_7{
    public static void main(String[] args) {
        // there are mainly 3 logical operators 
        //  1 && 
        //  2 || 
        //  3 !

        int a =10;
        int b = 20;
        int y =30;
        int z =40;
        // boolean result = a>b && y>z; // false
        // boolean result = a<b && y<z; // true  both the conditions must be true 

        // boolean result = a>b || y<z; // true atleast one condition should be true


        boolean result = a>b || y<z; // true atleast one condition should be true

        // at last not operator is used to change the output   like true output to false
        System.out.println(!result);

    }
}