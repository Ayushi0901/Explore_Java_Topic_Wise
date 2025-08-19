package TypeOfClasses;


/**
 * Pojo stands for "Plain old java object"
 * Contains variables and getter and  setter m,ethods
 * class should be public
 * public default constructor
 * No annotations should be used like @Table, @Entity @Id
 * Should not extend any class or implement any interface.
 */
public class PojoClass {
    int name;
    private int rollNum;
    protected  String address;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
