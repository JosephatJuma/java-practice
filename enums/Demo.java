enum Status {
    Pending, Approved, Failed, Success
}

public class Demo {
    public static void main(String[] args) {

        Status[] s = Status.values();
        for (Status status : s) {
            System.out.println(status);
        }
        Status val = Status.Success;
        switch (val) {
            case Pending:
                System.out.println("100");
                break;
            case Approved:
                System.out.println("210");
                break;
            case Failed:
                System.out.println("400");
                break;

            default:
                System.out.println("200");
                break;
        }

    }
}