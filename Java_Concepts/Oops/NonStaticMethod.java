package Oops;

public  class NonStaticMethod {
    private static String outerField = "Outer";

    class InnerClass {
        public void display() {
            System.out.println("Outer Field: " + outerField);
        }
    }
    NonStaticMethod outer = new NonStaticMethod();
    NonStaticMethod.InnerClass inner = outer.new InnerClass();
//    inner.display();

}



