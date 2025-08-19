package TypeOfClasses;

/**
 * The type Enum class.
 */
public class EnumClass{

    public static void main(String[] args) {
//       Common functions which is used
//       - values()
//       -Ordinal()
//       -valueOf()
//       -name()
        /**
         *  usage of values and ordinal()
         */
        for (EnumSample sample:EnumSample.values()){
            System.out.println(sample.ordinal());
            //output
            //0
            //1
            //2
            //3
            //4
            //5
            //6
        }

        // usage of valueOf and name()
        EnumSample enumVariable=EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());
    }

    
}
