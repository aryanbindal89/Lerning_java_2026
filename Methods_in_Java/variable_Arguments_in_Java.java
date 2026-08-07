package Methods_in_Java;

public class variable_Arguments_in_Java {
    static int sum(int x, int ...arr){
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println(sum(105, 5));
        System.out.println(sum(200,100,1000));
    }
}
