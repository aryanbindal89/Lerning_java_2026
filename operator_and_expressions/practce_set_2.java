package operator_and_expressions;
import java.util.Scanner;

public class practce_set_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1 = what will be the result of following expression??
        float a = 7/4.0f*9/2.0f;
        System.out.println(a); // 7.875
        
        //question 2 = Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char)(grade + 8) ;
        System.out.println(grade);

        //Decrypting the Grade
        grade = (char)(grade - 8) ;
        System.out.println(grade);

        //question 8 = use comparison operator to find out whether a given number is grater then the user enterd number or not??
        int number = sc.nextInt();
        System.out.println(number>8);

        sc.close();
    }
    
}
