package variables_and_Data_Types;

import java.util.Scanner;

// Question: Write a program to calculate percentage of a given student in CBSE Board exam.

public class exercise_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Subject Marks: ");
        int a = sc.nextInt();

        System.out.print("Enter Your Second Subject Marks: ");
        int b = sc.nextInt();

        System.out.print("Enter Your Third Subject Marks: ");
        int c = sc.nextInt();

        System.out.print("Enter Your Fourth Subject Marks: ");
        int d = sc.nextInt();

        System.out.print("Enter Your Fifth Subject Marks: ");
        int e = sc.nextInt();

        int sum = a + b + c + d + e;

        double per = (sum / 500.0) * 100;

        System.out.println("Total Marks = " + sum);
        System.out.println("Percentage = " + per + "%");

        sc.close();
    }
}