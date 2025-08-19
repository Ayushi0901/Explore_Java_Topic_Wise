package TypeOfClasses;

public class SingletonClass {
    //This class objective is to create only 1 object. Or single instance oof an object.
    // Different wys of creating Singleton class
    //1. Eager Initialization
    //2. lazy
    //3. Synchronization block
    //4. Double check lock(there is a memory issue, resolved Volatile instance variable
    //5. Bill pugh solution
    //6. Enum Singleton

////    Eager Initialization
//   private static SingletonClass conDBConnObject=new SingletonClass();
//   private SingletonClass(){
//
//   }
//   public static SingletonClass getInstance(){
//       return conDBConnObject;
//   }
//
//    public static void main(String[] args) {
//        SingletonClass singletonClass = SingletonClass.getInstance();
//    }

//   //Lazy Initialization
//   private static SingletonClass conOnject;
//   private SingletonClass(){
//
//   }
//   public static SingletonClass getInstance(){
//       if(conOnject==null){
//           conOnject=new SingletonClass();
//       }
//       return conOnject;
//   }

//    //Synchronized
//       private static SingletonClass conOnject;
//   private SingletonClass(){
//
//   }
//   //  usingsynchronized making the problem slow
//   synchronized  public static  SingletonClass getInstance(){
//       if(conOnject==null){
//           conOnject=new SingletonClass();
//
//       }
//       return conOnject;
//   }

////double check locking system
   private static volatile SingletonClass conOnject;
   private SingletonClass(){

   }
public static  SingletonClass getInstance(){
    if(conOnject==null){
        synchronized (SingletonClass.class){
            if(conOnject==null){
                conOnject=new SingletonClass();
            }
        }
    }
    return conOnject;
}
    // issue is memory



}
