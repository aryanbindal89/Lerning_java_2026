package conditiones_in_java;
import java.util.Scanner;

class switch_case_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age");
        age = sc.nextInt();


        switch (age){
            case 13:
                System.out.println("You are going to become teen!!");
                break;
            case 18:
                System.out.println("You are going to become adult!!");
                break;
            default:
                System.out.println("nothing");

            
        }
/* 
       if(age>56){
            System.out.println("You are experienced");
        }
        else if(age > 56){
            System.out.println("You are semi-experienced");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced!!");
        }

*/
        sc.close();
    }

}