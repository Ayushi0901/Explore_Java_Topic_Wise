package Oops;

public class ThisVsSuper {
//    /**
//     * The Len.
//     */
//    int len;
//    /**
//     * The Bre.
//     */
//    int bre;
//
//    /**
//     * Instantiates a new This vs super.
//     *
//     * @param l the l
//     * @param b the b
//     */
//    public Oops.ThisVsSuper(int l, int b) {
////        this.len = len;
////        this.bre = b;
////        this.len = len;
////        this.bre = bre;
//        len = l;
//        bre = b;
//    }
//
//    /**
//     * Display.
//     */
//    void display() {
//        System.out.println("Length" + this.len);
//        System.out.println("Breadth" + this.bre);
//
//    }
//
//    /**
//     * The entry point of application.
//     *
//     * @param args the input arguments
//     */
//    public static void main(String[] args) {
//        int l = 7;
//        int b = 9;
//        Oops.ThisVsSuper v = new Oops.ThisVsSuper(l, b);
//        v.display();
//    }
//
//
///* THIS
//this keyword is a reserved keyword in java i.e, we can’t use it as an identifier. It is used to refer current class’s instance as well as static members. It can be used in various contexts as given below:
//
//to refer instance variable of current class
//to invoke or initiate current class constructor
//can be passed as an argument in the method call
//can be passed as argument in the constructor call
//can be used to return the current class instance
//
// */


    int length;
    int breadth;
    int x = 10;

    public ThisVsSuper(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public static class Cuboid extends ThisVsSuper {
        int height;
        int x = 20;

        Cuboid(int l, int b, int h) {
            super(l, b);
            height = h;
        }

        void display() {
            System.out.println(super.x);
            System.out.println(x);
        }
    }


    public static void main(String[] args) {

        Cuboid c = new Cuboid(10, 5, 15);
        c.display();


    }
}
   /*
   Super-:
super is a reserved keyword in java i.e, we can’t use it as an identifier.
super is used to refer super-class’s instance as well as static members.
super is also used to invoke super-class’s method or constructor.
super keyword in java programming language refers to the superclass of the class where the super keyword is currently being used.
The most common use of super keyword is that it eliminates the confusion between the superclasses and subclasses that have methods with same name.
    */

