
abstract interface Computer {
    abstract public void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("write, compile, run, test, deploy");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("write, compile, run, test, deploy: Faster");
    }
}

class Developer {
    public void writeCode(Computer comp) {
        comp.code();
    }
}

public class Demo {
    public static void main(String[] a) {
        Developer josephat = new Developer();
        Computer hp = new Laptop();
        Computer dell = new Desktop();
        josephat.writeCode(dell);

    }
}