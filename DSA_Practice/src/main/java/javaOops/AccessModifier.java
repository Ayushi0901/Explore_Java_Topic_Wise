package javaOops;

public class AccessModifier {
    public static void main(String[] args) {
 Child accessModifier=new Child();
 accessModifier.showMsg();
    }
}
class Child extends AccessModifier{
    protected String message="Hello world";
    protected void showMsg(){
        System.out.println(message);
    }
}

