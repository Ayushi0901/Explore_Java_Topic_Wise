package Strings;

public class StringObject {
public static void main(String[] args){
    String str1="Java Program";//literal
    String str2=new String("JAVA");
    char[] c ={'H','E','L','L','O'};
    String str3=new String(c);
    byte[] b ={65,66,67,68};
    String str4 = new String(b,1,2);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);

    String s1="Java";
    String s2="Java";
    String s3="java";
    System.out.println(s2==s1); //true // because JAva is maintaining a single object in a pool.
    System.out.println(s2==s3); //false //JAva maintains two different objects and they are referring to two different objects.

    String s4=new String("Java");
    System.out.println(s2==s4);

}
}
