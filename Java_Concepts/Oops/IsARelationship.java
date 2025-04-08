package Oops;

class Animals {
    void makeSound(){
        System.out.println("Animal make sounds");
    }

}
 class Dogs extends Animals{
        void makeSound(){
            System.out.println("BARK");
        }
    }
public class IsARelationship {
    public static void main(String[] args) {
        Animals animals= new Dogs();
        animals.makeSound();
    }}

