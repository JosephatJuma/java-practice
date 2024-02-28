
public class Demo {
    public static void main(String[] a) {
        // class wrappers re used to convert primitive to object types
        int num = 10;
        /*
         * The conversion to object type is called boxing
         * we can convert primitive value to object type
         */
        // Integer num1 = new Integer(num); deprecated
        Integer num1 = num;
        // Integer is a wrapper class
        /*
         * the above is called autoboxing because it is done automatically,
         * the value of num is converted to Integer
         */

        System.out.println(num1);

        // auto-unboxing
        int num3 = num1;

        System.out.println(num3);

        /*
         * Other wrapper classes
         * - Boolean
         * - Character
         * - Byte
         * - Short
         * - Long
         * - Float
         * - Double
         * - String
         * - Enum
         * - Date
         * 
         */

        String str = "10";
        Integer num4 = Integer.parseInt(str);
        System.out.println(num4.intValue());

        Double num5 = Double.parseDouble(str);
        System.out.println(num5);

        Character ch = str.charAt(0);
        String str1 = ch.toString().concat("hello");
        System.out.println(str1);

    }
}