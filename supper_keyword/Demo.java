class A {
    public A() {
        /*
         * the super method is used to call the constructor of the parent class
         * by default the constructor of the parent class is called
         * we pass argument to the constructor of the parent class to call a
         * constructor with params
         */
        super();
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A Int");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("In B");
    }

    public B(int n) {
        super(n);
        System.out.println("In B Int");
    }
}

class Demo {
    public static void main(String[] a) {
        B obj = new B(2);
    }
}

/*
 * By default, class A extends Object class (java.lang.Object).
 */