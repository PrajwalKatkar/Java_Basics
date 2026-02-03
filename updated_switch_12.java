public class updated_switch_12{
    public static void main(String[] args) {
        String days ="monday";
        switch(days){
            case "saturday","sunday"->System.out.println("8am");

            case "monday"->System.out.println("6am");

            default ->System.out.println("10am");

        }
    }
}