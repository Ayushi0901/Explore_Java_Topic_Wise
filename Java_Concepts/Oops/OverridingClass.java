package Oops;

public class OverridingClass {
  static int value=9;
    // Method in the superclass
    public void display() {
         int value=9;
        System.out.println("Class display");
    }

    // Static nested subclass that overrides the display() method
    public static class Sub extends OverridingClass {
        @Override
        public void display() {
            System.out.println("Subclass display");
        }
    }

    public static void main(String[] args) {
        // Reference of superclass holding subclass instance
        OverridingClass oc = new Sub();

        // Reference and instance of superclass
        OverridingClass oc1 = new OverridingClass();

        // Reference and instance of subclass
        Sub oc2 = new Sub();

        // The following line will cause an error because a superclass instance
        // cannot be assigned to a subclass reference.
        // Sub oc3 = new Oops.OverridingClass(); // Error: incompatible types

        // Calling display method on each reference to observe method overriding
        oc.display();   // Prints: Subclass display
        oc1.display();  // Prints: Class display
        oc2.display();  // Prints: Subclass display
        // oc3.display(); 
    }
}
