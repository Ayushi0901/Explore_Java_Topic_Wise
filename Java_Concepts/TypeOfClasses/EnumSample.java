package TypeOfClasses;

/**
 * The Enum class has a collection of CONSTANTS 
 * CONSTANTS are static and final implicitly(we dont have to write it)
 * Cannot extend any class as it internally extends java.lang.Enum
 * implements interfaces 
 * Can have variables, constructor, methods
 * Can't be initiated
 * No other class can extend Enum class
 * It can have abstract method and all constant should implement that method.
 */
public enum EnumSample {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
}
