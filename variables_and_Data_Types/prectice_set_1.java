package variables_and_Data_Types;
import java.util.Scanner;

class prectice_set_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Write a program to sum 3 numbers in java??
        int a = 33;
        int b= 7;
        int c = 10;
        int sum = a + b + c ;
        System.out.println(sum);

        // 2. Write a program to calculate CGPA using marks of 3 subject out of 100??
        int subject1 = 90;
        int subject2 = 88;
        int subject3 = 99;
        float cgpa = ((subject1 + subject2 + subject3)/3)/10;
        System.out.println(cgpa);

        // Write a java program which ask the user to enter his/her name and great them with the "Hello <name>" text??
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " .Have a Great Day");

        // Write a java program to detect wheater a number entered by the user is integer or not??

        boolean number = sc.hasNextInt(a);
        System.out.println(number);

        sc.close();
    }

}