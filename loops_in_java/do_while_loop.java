package loops_in_java;

/**
 * do_while_loop
 */
public class do_while_loop {
    public static void main(String[] args) {
        int a = 0;
        while (a<5) {
            System.out.println(a);
            a++;
        }
        System.out.println("_____________________________________");
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<5);
    }
    
}