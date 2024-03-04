class ErrorException extends Exception {
    public ErrorException(String message) {
        super();
    }
}

public class Demo {
    public static void main(String[] a) {
        int marks = 49;
        // int grades[] = new int[5];
        try {
            // System.out.println(grades[5]);
            System.out.println(marks / 0);
            throw new ErrorException("An arithmetic error occured");
        } catch (ErrorException exc) {
            System.out.println(exc.getMessage());

        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}