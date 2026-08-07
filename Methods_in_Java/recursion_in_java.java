package Methods_in_Java;

public class recursion_in_java {
    static  int factorial(int n){
        if (n==0  || n==1) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 55;
        System.out.println("The Value of factorial n is: " + factorial(n));
    }
}
