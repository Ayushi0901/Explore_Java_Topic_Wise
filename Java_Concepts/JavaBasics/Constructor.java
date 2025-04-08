package JavaBasics;

public class Constructor {
//    Constuctor have same name as class, with no return type and
//    they are of 2 types -parameterized and non parameterized;
//    non parameterized is the replacement of default constructor
    public double len;
    public double breadth;

//    //parameterized
//    public JavaBasics.Constructor(int l, int b) {
//        len = l;
//        breadth = b;
//    }


    public double area() {
        return len * breadth;
    }


    public double perimeter() {
        return 2 * (len + breadth);
    }


    public boolean isSquare() {
        if (len == breadth) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Constructor con = new Constructor();
        con.len = 100;
        con.breadth = 19;
        System.out.println("Area" + con.area());
        System.out.println("Perimeter" + con.perimeter());
        System.out.println("Square" + con.isSquare());
    }
}
