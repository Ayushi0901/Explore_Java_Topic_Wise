package Oops;

public class OopsEncapsulation {
//    Encapsulation	is	the	process	of	grouping	data	in	a	single	section.
//  For	Example
//    Complete	television	is	single	box	where	all	the	mechanism	are	hidden	inside	the
//    box	all	are	capsuled.
//Key Components of Encapsulation:
//    Private Variables: The internal data of a class is made private so that it can't be directly accessed from outside the class.
//    Public Oops.Methods (Getters and Setters): These methods are used to access and update the private variables, offering controlled access to the data.
//    Access Modifiers: These include private, public, protected, and default (package-private), which define the visibility and access control of class members.


        // Private variables
        private static String name;
        private static int age;

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            if(age > 0) {  // Validation
                this.age = age;
            } else {
                System.out.println("Age cannot be negative.");
            }
        }

        // JavaBasics.Constructor to initialize data
        public OopsEncapsulation(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display information
        public static void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
        public static void main(String[] args){
           new OopsEncapsulation("ayushi",22);

            displayInfo();
        }
    }


