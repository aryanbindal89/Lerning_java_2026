package variables_and_Data_Types;
import java.util.Scanner;


public class input_in_java {

    public static void main(String[] args) {
        System.out.println("Taking Input Form the user");

        Scanner sc = new Scanner(System.in);
         
         //System.out.println("Enter number 1:");
         //int a = sc.nextInt();
         //System.out.println("Enter number 2:");
         //int b = sc.nextInt();
         //int sum = a + b ;
         //System.out.println("The sum of no is");
         //System.out.println(sum);
        boolean b = sc.hasNextInt();
        System.out.println(b);           

        sc.close();
    }
}
