package conditiones_in_java;

public class relational_logical_operator {
    public static void main(String[] args) {
        System.out.println("For logical operator And");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For logical operator or");
        boolean d = true;
        boolean e = false;
        boolean f = true;

        if (d || e || f){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical operator Not ");
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!c);

    }
}
