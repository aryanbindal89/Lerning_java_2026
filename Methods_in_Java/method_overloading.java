package Methods_in_Java;

public class method_overloading {
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0]= 98;
    }


    static void telljoke(){
        System.out.println("I invited a new word!! \n   plagiarism!! ");
    }

    static void foo(){
        System.out.println("Good Morning Bro!!");
    }
    static void foo(int a){
        System.out.println("Good Morning" + a + "bro!!");
    }
    public static void main(String[] args) {
       // telljoke();
     //  int [] marks = {55, 60 ,90 ,100 ,90};
      // change2(marks);
       //System.out.println(marks[0]);

       //Changinng the innteger
       /*  int x = 45;
        change(x);
        System.out.println("The value of x after changing is " + x);
        */


        //Method Overloading
        foo();
        int a = 100;
        foo(a);
        //Arguments are actual!!
        
    }
}
