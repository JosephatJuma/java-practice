interface Computer {

    public void start();

    public void shutdown();

    /**
     * Inner Interface
     */
    public interface Mobile {
        public void call();

    }

}

interface Laptop extends Computer {
    public void fold();
}

interface Desktop extends Computer {
    public void open();
}

class MacBook implements Laptop {
    public void start() {
        System.out.println("MacBook is starting");
    }

    public void shutdown() {
        System.out.println("MacBook is shutting down");

    }

    public void fold() {
        System.out.println("MacBook is folding");
    }
}

class SmartPhone implements Computer, Computer.Mobile {
    public void start() {
        System.out.println("SmartPhone is starting");
    }

    public void call() {
        System.out.println("SmartPhone is calling");

    }

    public void shutdown() {
        System.out.println("SmartPhone is powering down");

    }

}

public class Demo {
    public static void main(String[] a) {
        Laptop c = new MacBook();
        c.start();
        c.shutdown();
        c.fold();
        System.out.println();

        Desktop d = new Desktop() {
            public void start() {
                System.out.println("Desktop is starting");
            }

            public void shutdown() {
                System.out.println("Desktop is shutting down");

            }

            public void open() {
                System.out.println("Desktop is opening");

            }

        };
        d.start();
        d.shutdown();
        d.open();
        System.out.println();

        SmartPhone galaxy10 = new SmartPhone();
        galaxy10.start();
        galaxy10.call();
        galaxy10.shutdown();

    }

}