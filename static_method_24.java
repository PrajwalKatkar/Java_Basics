
class Mobile{
    String name;
    String brand;
    static int price;

    void show(){
        System.out.println(name+brand+price);
    }
    public static void show1(Mobile m){
        System.out.println(m.name+m.brand+price);
    }
}

public class static_method_24{
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

        Mobile.show1(m1);
        Mobile.show1(m2);
    }
}