package Oops;

public class SuperVsThis {
    static class Animal {
        String name = "animal";


        public void getName() {
            System.out.println("Animal has a name");
        }

        public Animal(String name) {
            System.out.println("Animal has a sound" + name);
        }

    }


    static class Horse extends Animal {
        String name = "horse";

        @Override
        public void getName() {
            System.out.println("Animal has name horse");
        }

        public Horse() {
            super("Horse");
        }

        public void animalName() {
            System.out.println(super.name);
            System.out.println(this.name);
        }


    }


    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.animalName();

    }
}
