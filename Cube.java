class Cube {
    double width;
    double height;
    double depth;
    double length;

    Cube() {
        System.out.println("Constructing Cube");
        width = 10;
        height = 10;
        depth = 10;
    }
}

class Mymain{
    public static void main(String[] args) {
        Cube c1 = new Cube();   
        System.out.println(c1.width);
    }
}
