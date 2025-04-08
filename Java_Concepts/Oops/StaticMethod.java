package Oops;

public class StaticMethod {
//    // 1. Static variable
////    Definition: A static variable is shared among all instances of a class.
////
////    Purpose: It belongs to the class rather than any instance, so only one copy of the variable exists, regardless of how many objects are created.
////
////    Usage: Generally used for constants or variables that need to be shared across all instances.
//
//    static int count =0;   //variable  declaration
//    Oops.StaticMethod(){
//        count++;
//    }
//    public static void main(String[ ]args){
//        new Oops.StaticMethod();
//        new Oops.StaticMethod();
//        new Oops.StaticMethod();new Oops.StaticMethod();new Oops.StaticMethod();
//
//
//        System.out.println("Count"+ count);
//    }

////    2. Static methods
////    Definition: A static method belongs to the class rather than any object of the class.
////
////    Purpose: It can be called without creating an instance of the class.
////
////    Limitations: A static method cannot access non-static (instance) variables or methods directly. It can, however, access other static variables and methods.
////
////    Common Use Cases: Utility or helper methods (like Math.sqrt()), factory methods, etc.
//
//    static int cube (int x){
//        return x*x*x;
//    }
//    public static void main(String[] args){
//        int res= Oops.StaticMethod.cube(7);
//        System.out.println(res);
//    }

////    3. Static blocks
////    Definition: A static block is used for static initialization of a class.
////
////    Purpose: It executes only once when the class is loaded into memory, typically used to initialize static variables.
////
////   Characteristics: Can contain code that runs once, regardless of the number of objects created.
//
//    static int num;
//
//    //static block
//    static {
//        num = 10;
//        System.out.println("Static block initialized:" + num);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Oops.Main method,num is" + num);
//    }

    //    4. static inner class
//    Definition: A nested class declared as static.
//
//    Purpose: Unlike inner (non-static) classes, a static inner class can be instantiated without an outer class instance. It cannot directly access non-static members of the outer class.
//
//    Common Use Case: To logically group classes together or to use nested classes without depending on an instance of the outer class.
    static int data = 30;

    static class StaticClass {
        void display() {
            System.out.println("data is" + data);
        }
    }

    public static void main(String[] args) {

//    StaticClass nested = new StaticClass();
        StaticMethod.StaticClass nested = new StaticMethod.StaticClass();
        nested.display();
    }
}
