class Adding{
    public int add(int n1 ,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1 ,int n2){
        return n1+n2;
    }
}
// if we are using same name of methods then we have to change the parameters otherwise it will give us a error this is known as method overriding 
public class method_overloading_18{
    public static void main(String[] args) {
        Adding a = new Adding();
        int result = a.add(2,3);
        System.out.println(result);

    }
}