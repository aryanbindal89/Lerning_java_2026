package Abstract_class_and_abstract_methods;

public class abstract_class_and_abstract_methods {

    static abstract class Parent {
        public Parent() {
            System.out.println("I am constructor of base...");
        }

        public void sayhello() {
            System.out.println("Hello...");
        }

        abstract public void greet();
    }

    static class Child extends Parent {
        @Override
        public void greet() {
            System.out.println("Good Morning!!");
        }
    }

    static abstract class Child2 extends Child {
        public void th() {
            System.out.println("I am Good...");
        }
    }

    public static void main(String[] args) {

        Parent p = new Child();
        Child c = new Child();

        p.greet();
        p.sayhello();

        c.greet();
        c.sayhello();
    }
}