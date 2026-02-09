class Enp{
    private int age;
    private String name;

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname(){
        return name;
    }
}


public class this_26{
    public static void main(String[] args) {
        Enp e = new Enp();
        e.setage(18);
        e.getage();
        e.setname("Prajwal");
        e.getname();

        System.out.println("name: "+e.getname()+"    age: "+e.getage());
    }
}