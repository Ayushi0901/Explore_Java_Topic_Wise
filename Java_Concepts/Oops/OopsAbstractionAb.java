package Oops;

abstract class OopsAbstraction {
//    Abstraction	means	hiding	internal	details	and	showing	the	required
//    things.
// For Example:
//    Consider a man driving a car, while driving he focus on using of steering, gear,
//    accelerator etc.
//    He does not require to know the inner mechanism of the car

    // Abstract method (does not have a body)
    public abstract void sound();

    // Regular method (has a body)
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

    // Subclass (inherited from Animal)
    class Dog extends OopsAbstraction {
        // Providing the implementation for abstract method sound
        @Override
        public void sound() {
            System.out.println("The dog barks.");
        }
    }

    class Main {
        public static void main(String[] args) {
            // Cannot instantiate an abstract class
            // Animal myAnimal = new Animal(); // This would cause an error

            // Create a Oops.Dog object
            OopsAbstraction myDog = new Dog();

            // Calling abstract and non-abstract methods
            myDog.sound(); // Oops.Dog's sound
            myDog.eat();   // Common eat method
        }
    }


