package Oops;

public class ConstructorInInheritence {
    //constructor creation
    public ConstructorInInheritence() {
        System.out.println("Parent Constrcutor");
    }

}

class Child extends ConstructorInInheritence {
    public Child() {
        System.out.println("Oops.Child JavaBasics.Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Oops.Child JavaBasics.Constructor");
    }
}

class InheritConst {

    public static void main(String[] args) {

        GrandChild c = new GrandChild();
    }

}
