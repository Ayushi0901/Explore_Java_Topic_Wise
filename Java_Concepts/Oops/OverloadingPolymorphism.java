package Oops;

public class OverloadingPolymorphism {
public int max(int a, int b){
    return a>b?a:b;
}
public int max(int a, int b, int c){
    if(a>b && a>c) return a;
    else if(b>c){
        return b;
    }
    return c;
}
public static void main(String[] args){
    OverloadingPolymorphism olp = new OverloadingPolymorphism();
    System.out.println(olp.max(10,5));
    System.out.println(olp.max(1880,5,8));
}


/*
Java uses dynamic method dispatch to resolve overridden methods at runtime.
When a method is called on a superclass reference,
 Java looks at the actual object type and calls the method defined in the subclass.
 */
}
