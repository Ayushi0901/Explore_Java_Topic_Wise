//package Interfaces;
//
//public interface NeedInterface {
////    //1. Abstraction using interface, we can Achieve full abstraction means, we can define what class must do
////    // , but not how it will do
////
////    public void fly();
////}
////
////public class Eagle implements NeedInterface {
////    @Override
////    public void fly() {
////        // the complex process of flying take place here
////    }
//
//    // 2. PolyMorphism
////-Interface can be used as a data type
//// we can not create the object of an interface, but  it can hold the reference of all the classes which implements it, and at the runtime, it decide which method need to be involved.
////    public class Eagle implements Bird {
////        @Override
////        public void fly() {
////            System.out.println("Eagle fly implementation");
////
////        }
////    }
////    public class Hen implements Bird{
////        @Override
////        public void fly(){
////            System.out.println("Hen fly");
////        }
////    }
////
////}
////public class NeedInterface {
////    public static void main(String[] args) {
////        Bird bird= new Eagle();
////        Bird bird1=new Eagle.Hen();
////        bird.fly();
////        bird1.fly();
////    }
////}
////3. Multiple Inheritance
