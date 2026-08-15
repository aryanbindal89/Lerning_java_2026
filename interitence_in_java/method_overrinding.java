package interitence_in_java;

class A {
    public int a;

    public int aryan() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    public void meth2() {
        System.out.println("I am method 3 of class B");
    }
}

public class method_overrinding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}