package interitence_in_java;

public class constructor_in_inheritence {
    class base1{
        base1(){
            System.out.println("I am a constructor");
        }
                base1(int a){
            System.out.println("I am a overloaded constructor with value of a as:" + a);
        }
    }
    

    class derived1 extends base1{
        derived1(){
            super(0);
            System.out.println("I am contructor of derived class...");
        }
    }

    public static void main(String[] args) {
        constructor_in_inheritence obj = new constructor_in_inheritence();
        base1 b = obj.new base1();
        derived1 d = obj.new derived1();

    }
}
