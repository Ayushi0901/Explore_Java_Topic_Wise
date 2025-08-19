package TypeOfClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    // IMMUTABLE CLASS:
    //We can not change the value of an object once it is created.
    //Declare class as 'final' so that it can not be extended.
    //All class members should be private. So that direct access can be avoided.
    //And class members are initialized only once using constructor.
    //There should not be any setter methods, which is generally use to change the value.
    //Just getter methods. And returns Copy of the member variable.
    //Example: String, Wrapper Classes etc.
  private final String name;
  private final List<Object> petName;
  ImmutableClass(String name, List<Object> petName){
      this.name=name;
      this.petName=petName;

  }
  public String getName(){
      return name;
  }
  public List<Object> getPetName(){
      //this is requrired becoz making list final means
      //you can't now point it to new list, but still can add delete values
      //in it, so that's why we send the copy of it
      return new ArrayList<>(petName);
  }

    public static void main(String[] args) {
        List<Object> petNames= new ArrayList<>();
        petNames.add("s");
        petNames.add('p');
        ImmutableClass obj= new ImmutableClass("Ay",petNames);
        obj.getPetName().add("hi"); //added in copy
        System.out.println(obj.getPetName());
    }
}
