package interitence_in_java;

public class inheritence_in_java {

    class base {
        int x;

        public int getx() {
            return x;
        }

        public void setx(int x) {
            this.x = x;
        }

        public void Printme() {
            System.out.println("I am a Constructor");
        }
    }

    class Derived extends base {
        int y;

        public int gety() {
            return y;
        }

        public void sety(int y) {
            this.y = y;
        }
    }

    public static void main(String[] args) {

        inheritence_in_java obj = new inheritence_in_java();

        // Object of base class
        base b = obj.new base();

        b.setx(10);
        System.out.println(b.getx());

        // Object of Derived class
        Derived a = obj.new Derived();

        a.setx(20);          // inherited from base
        System.out.println(a.getx());

        a.sety(30);          // Derived's own method
        System.out.println(a.gety());
    }
}