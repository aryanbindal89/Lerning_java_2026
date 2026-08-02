package conditiones_in_java;
import java.util.Scanner;

class practice_set_3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // question 1 - What will be the output for the program??
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        //Output = I am not 11.

        //Question-2 Write a program to find out whether a student is pass or fai: if it require total 40% and at least 33% in each subjects to pass. Assume 3 subjects and take marks as an input from the user??

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        float avg = (sub1 + sub2 + sub3)/3;
        System.out.println(avg);

        if(avg>=40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("You are passed the exam");
        }
        else{
            System.out.println("Better luck next time");
        }

        //question 3 = Write a java program to find whether a year entred by the user is a leap year or not??
        int year = sc.nextInt();
        int ly = year/4;
        if (ly==0) {
        System.out.println("This leap year");            
        }
        else{
            System.out.println("This is not a leap year");
        }

        

        sc.close();
    }
}