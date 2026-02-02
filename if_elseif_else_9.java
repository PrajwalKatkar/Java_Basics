public class if_elseif_else_9{
    public static void main(String[] args) {
        int a = 35;
        int b = 40;
        int c = 30;
        if(a>b && a>c){
            System.out.println("A is greater than b and c");
            System.out.println("good morning");
        }
        else if(b>c){
            System.out.println("b is greater than a and c");
        }
        else{
            System.out.println("c is greter than a and b");
            System.out.println("nice try");
        }
    }
}