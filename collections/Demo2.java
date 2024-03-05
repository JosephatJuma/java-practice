import java.util.*;

public class Demo2 {
    public static void main(String[] args) {

        // A Map is an unordered collection of key-value pairs.
        /*
         * Keys are unique
         * Values can be duplicated
         * combination of a Set(non-ordered, unique) and ab List(ordered, duplicated)
         * Each key-value pair has a unique key
         * We use the put method to add key-value pairs
         * We use the get method to retrieve values
         * We use the remove method to remove key-value pairs
         * -HashMap is an implementation of the Map interface
         * -Hashtable is an implementation of the Map interface but synchronized
         */
        Map<String, Integer> students = new HashMap<>();
        students.put("Marvin", 80);
        students.put("Jacquelin", 70);
        students.put("Charles", 95);
        students.put("Bob", 65);

        // updates the value of the key
        students.put("Marvin", 0);
        students.remove("Marvin");// removes Marvin from the map

        // for (Map.Entry<String, Integer> entry : students.entrySet()) {
        // System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));

        }
    }

}
