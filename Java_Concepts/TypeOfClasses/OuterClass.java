package TypeOfClasses;

public class OuterClass {
    int instanceVariable=10;
    static int classVariable=20;
    static  class  NestedClass{

//        public void print(){
//            System.out.println(classVariable+instanceVariable); //error because static inner class can only access static variable/method
//        }
public void print(){
    System.out.println(classVariable); //error because static inner class can only access static variable/method
}
        public void display(){
          Nested_class nestedClass=new Nested_class();
//          nestedClass.print();//error because static inner class can only access static variable/method
        }
    }

    public static void main(String[] args) {
        OuterClass outerclassObj=new OuterClass();
//        outerclassObj.display();
    }
}
