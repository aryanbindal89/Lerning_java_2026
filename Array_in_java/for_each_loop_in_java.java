package Array_in_java;

public class for_each_loop_in_java{
    public static void main(String[] args) {
        int [] a = {44, 44, 55 , 55 ,66};
       // System.out.println(a.length);
        //Displaying array
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("another method");
        for( int element: a){
            System.out.println(element);
        }


      /*   String [] students = {"Aryan", "Aviral", "Harshit", "Parv"};
        System.out.println(students.length);
        System.out.println(students[2]);  */
    }
}