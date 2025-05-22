package JavaBasics;

public class ChainingConstructor {
    String name;
    int empId;
    ChainingConstructor(){
        this(33);
    }
    ChainingConstructor(int empId){
        this("ayu",empId);
    }
    ChainingConstructor(String name, int empId){
        this.name=name;
        this.empId=empId;
    }

    //this keyword can be used in only one class
}
