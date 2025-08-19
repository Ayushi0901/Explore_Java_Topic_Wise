//package TypeOfClasses;
//
///**
// * Generic class helps us to write a class in a generic manner that helps to avoid the typecasting that we'll have to use win object class.
// */
//public class GenericClass {
//    Object value;
//
//    public Object getPrintValue() {
//        return value;
//    }
//
//    public void setPrintValue(Object value) {
//        this.value = value;
//    }
//// Object is the parent of every class, we used it here. Now, here value
//// can be of any type, string, interger etc. the only issue is that we'll have to typecast it
//public static void main(String[] args) {
//    GenericClass printObj1=new GenericClass();
//    printObj1.setPrintValue(2);
//    Object printValue=printObj1.getPrintValue();
//    //we can not use printValue directly, we have to typecaast it else it will be compile time error
//    if((int)printValue==1){
//
//    }
//}
//
//}
////how to define Generic class
//// we can use <T>, this T can be any alphabet like A,B,C
//public class Print<T>{
//
//}
//      T value;
// public T getPrimitiveValue(){
//     return  value;
// }
// public void setPrintValue(T value){
//     this.value=value;
// }
//
//
// //types of generic claases
////