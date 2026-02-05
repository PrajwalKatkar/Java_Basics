class Calculator{
    public int add(int n1,int n2){
        int r = n1+n2;
        return r;
    }
}


public class class_object_16{
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        Calculator calc = new Calculator();
        int x = calc.add(n1,n2);
        System.out.println(x);
    }
}