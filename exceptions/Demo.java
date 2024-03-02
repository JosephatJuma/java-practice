
public class Demo {
    public static void main(String[] a) {
        int marks = 49;

        try {
            int final_marks = marks / 0 * 100;
            System.out.println(final_marks);
        }

        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}