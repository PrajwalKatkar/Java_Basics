
class Mobile{
    String name;
    String brand;
    static int price;

    void show(){
        System.out.println(name+brand+price);
    }

}

public class static_variable_23{
        public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.name="s24";
        m1.brand="samsung";

        m2.name="13 pro";
        m2.brand="Iphone";

        Mobile.price=50000;
        m1.show();
        m2.show();
    }
}