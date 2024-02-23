public class Demo {
    public static void main(String[] args) {
        String name = "Juma";
        System.out.println(name);
        name = name + " Josephat"; // value of name is not changed, the address of name is changes in the stack
                                   // memory
        System.out.println(name);
        name = name.toUpperCase();
        System.err.println(name);

        // String is immutable
        // Sting is a class
        String name2 = new String("Juma");
        System.out.println(name2);
        // since string is immutable, it can not be changed,but to make it murtable,
        // we use StringBuffer or StringBuilder, these two are similar

        StringBuffer sb = new StringBuffer("Juma");
        sb.append(" Josephat"); // here the value of sb is changed

        System.out.println(sb);

        // converting the from StringBuffer to String
        // by default StringBuffern is not String
        // we use toString()
        String sb2 = sb.toString();
        System.out.println(sb2);

    }

}
