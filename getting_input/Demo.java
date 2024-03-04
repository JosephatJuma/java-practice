import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter a number of your choice");
        // try {
        // int num = System.in.read();
        // /*
        // * System.in.read() gives us the ascii value of the character
        // * ascii value of 0 is 48
        // * therefore we subtract 48 from the ascii value
        // */
        // System.out.println(num - 48);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        /*
         * the above does not give u
         * s the right value if we enter a later than 9
         */
        // System.out.println("Enter a number of your choice");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int number = Integer.parseInt(bf.readLine());
        // System.out.println(number);

        // bf.close();

        /*
         * the above code is long and in java 1.5, a Scanner class is introduced
         */

        System.out.println("Enter a number of your choice");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

    }
}