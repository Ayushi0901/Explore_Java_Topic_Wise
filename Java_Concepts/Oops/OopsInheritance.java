package Oops;

public class OopsInheritance {
    /*  Inheritance	means	designing	an	object	or	a	class	by	re-using	the
    properties	of	the	existing	class	and	object.
            • Inheritance	is	same	as	specialization.
             //Available but not accessible.
    Inheritance is a fundamental concept in Object-Oriented Programming (OOP) where a new class (child class or subclass) inherits the properties (fields) and behaviors (methods) of an existing class (parent class or superclass). This allows code reusability and a hierarchical classification of classes.

Key Concepts of Inheritance:
Parent (Superclass): The class whose properties and methods are inherited.
Oops.Child (Subclass): The class that inherits properties and methods from the parent class. It can also have its own unique properties and methods.
extends Keyword: Used to establish an inheritance relationship between two classes.
Single Inheritance: Java supports single inheritance, meaning a class can inherit from only one superclass.
Method Overriding: A subclass can override a method from the superclass to provide a specific implementation for that method.
super Keyword: Used to access methods and constructors of the superclass.
  For	Example
A	old	style	television	(idiot	box)	is	transformed	with	extra	features	into	slim	and
smart	television	where	it	re-used	the	properties	of	old	television.
*/



    //practise
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

    public static class Cylinder extends OopsInheritance {
        public double height;

        public double vol() {
            return area() * height;
        }
    }

    public static class Cylinder2 extends Cylinder {
        public double length;

        public double vol2() {
            return area() * length;
        }
    }

    public static void main(String[] args) {
        Cylinder2 c1 = new Cylinder2();
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        c1.length = 90;
        c1.radius = 77;
        c1.height = 100;
        System.out.println("Vol: " + c.vol());
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
        System.out.println("vol2: " + c1.vol2());
    }

}
