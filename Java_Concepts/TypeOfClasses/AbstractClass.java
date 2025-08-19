package TypeOfClasses;

public abstract class AbstractClass {
    //Show only imp features to users and hide its internal implementation
    // 2 ways to achieve abstraction
    // class is declared as abstracted through keyword "abstract"
    // it can have both abstract(method without body) and non abstract methods
    // we can't create an instance of this class
    //  parent has some features which all child classes have in common then this can be used
    // Constructors can be created inside them, and with super keyword from child classes we can access them.
    int mileage;

    AbstractClass(int mileage) {
        this.mileage = mileage;
    }

    public abstract void pressBreak(); //Abstract method

    public abstract void pressClutch(); //Abstract method

    public int getNumberOfWheels() { //Non-Abstract method
        return 4;
    }

    public abstract class LuxuryCar extends AbstractClass {//Another abstract class inheriting above abstract class
        LuxuryCar(int mileage) {
            super(mileage);
        }

        public abstract void pressDualBreakSystem();//Additional abstract method

        @Override
        public void pressBreak() {
            //implementation of it goes here
        }

        public abstract static class Audi extends AbstractClass {//Concrete class inheriting abstract class (luxury car)
            Audi(int mileage) {
                super(mileage);
            }

            @Override
            public void pressClutch() {
                //implementation
            }

            @Override
            public void pressBreak() { //Bom abstract methods are implement
                //implementation
            }
        }
    }
}
