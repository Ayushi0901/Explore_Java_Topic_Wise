package TypeOfClasses;

public class ConcreteClass {
    //These are those class that we can create an instance using NEW keyword.
    // ALL the methods in this class have implemnetation
    // it can also be your child class from interface or extend abstract class
    // A class access modifier can be public or package private(no explicit modifier defined)

    int empId;

    ConcreteClass(int empId) {

        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}
