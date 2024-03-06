import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marvin");
        names.add("Jacquelin");
        names.add("Charles");
        names.add("Bob");
        /*
         * The compare method is responsible for comparing two objects and should return
         * an integer value. The integer return value indicates the order of the objects
         * being compared.
         * 
         * The convention is that the method should return a negative integer, zero, or
         * a positive integer. Here's how the return values are typically interpreted:
         * 
         * A negative integer indicates that the first object is less than the second.
         * Zero indicates that the two objects are equal in terms of the comparison.
         * A positive integer indicates that the first object is greater than the
         * second.
         */
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String name1, String name2) {
                if (name1.length() > name2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(names);
        System.out.println(names);
        names.add("Juma");
        Collections.sort(names, comp);
        System.out.println(names);
    }

}
