package interitence_in_java;

import operator_and_expressions.type_of_operators;

class one{
        public void great(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Aryan Agrawal");
    }
}


    class two extends one{
        public void swagat(){
            System.out.println("Apka swagat h!!");
        }
         public void name(){
        System.out.println("My name is Aryan Agrawal of class 2");
    }
    }


public class Dynamic_method_dispatch_in_java {
    public static void main(String[] args) {
       // one obj = new one();
       // two obj2 = new two();
       // obj.name();
       one obj = new two();
       obj.great();
       obj.name();
    }
}
