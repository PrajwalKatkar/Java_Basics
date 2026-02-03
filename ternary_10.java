public class ternary_10{
    public static void main(String[] args) {
        // ternary operator consists of  ? and :
        // syntax condition ? statement 1  : statement 2

        int a =10;
        int result;
        // if (a%2==0){
                // result =10;
        //     System.out.println(result);
        // }
        // else{
            // result =20;
        //     System.out.println(result);
        // }
        //  this same thing can be done in one line 
            result = a%2==0 ? 10 : 20;
            System.out.println(result);
    }
}