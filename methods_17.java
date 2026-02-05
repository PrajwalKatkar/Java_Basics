class Pens{
    public void hello(){
        System.out.println("Good morning");
    }

    public String cost(int cost){
        if(cost>=10){
            return "You are nice";
        }
    return "you got nothing";
    }

}


public class methods_17{
    public static void main(String[] args) {
        Pens os = new Pens();
        os.hello();
        String st = os.cost(9);
        System.out.println(st);
    }
}