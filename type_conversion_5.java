// byte b=127
// int a =250
// b=a it will not be able to convert int to byte  because byte has smaller range
// a=b it will work and  byte data will be allocated to a


public class type_conversion_5{
    public static void main(String []args){
        // byte b= 127;
        int a=12;
        byte b=(byte)a;  //explicit  conversion
        // a=b; // inplicit conversion
        System.out.println(b); // here a was in range of byte so the program printed 12 
        // but what if a is out of range of b 
        int c =257;
        byte d =(byte)c;
        System.out.println(d);
        // it printed 1 ,d did modulus with c 


        byte y = 10;
        byte x = 30;
        int z = x*y; //this is call type promotion
        System.out.println(z);

    }
}