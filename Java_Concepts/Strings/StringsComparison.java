package Strings;

public class StringsComparison {
    public static void main(String[] args) {
        String num="Ayu";
        String num1="Ayu";
        String newNum= new String("Ayu");
//        if(num.equals(newNum)){
//            System.out.println("Both are equal");
//        } else
            if(num==newNum){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
