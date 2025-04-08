package JavaBasics;

public class TypeCasting {

    public static void main(String[] args) {
//Widening/Automatic
        byte x = 34;
        int a = x;
        int a1=128;
        System.out.println(a);
     //downcasting/Explicit
        //range of byte = -128 to 127
        byte bytevar=(byte)a;
        byte bytevar1=(byte)a1;
        System.out.println(bytevar);
        System.out.println(bytevar1);


     //promotion during expression
        byte i=127;
        byte j=1;
        int sum= i+j; //byte sum = (byte)(i+j);
        System.out.println(sum);

     //explicit casting during expression
        double dobVal=45d;
        int sum1 = (int)(a+dobVal);
        System.out.println(sum1);
    }
}
