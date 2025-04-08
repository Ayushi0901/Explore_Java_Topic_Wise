package Oops;

public class MethodHiding {
    class Parent {
        static void display() {
            System.out.println("Parent static method");
        }
    }

    class Child extends Parent {
        static void display() {
            System.out.println("Oops.Child static method");
        }
    }

    public class Test {
        public void main(String[] args) {
            Parent obj = new Child();
            obj.display();
        }


    }

}

