class Enp{
    private int age;
    private String name;

    public void setage(int a) {
        age = a;
    }

    public int getage() {
        return age;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname(){
        return name;
    }
}


public class encapsulation_25{
    public static void main(String[] args) {
        Enp e = new Enp();
        e.setage(18);
        e.getage();
        e.setname("Prajwal");
        e.getname();

        System.out.println("name: "+e.getname()+"    age: "+e.getage());
    }
}