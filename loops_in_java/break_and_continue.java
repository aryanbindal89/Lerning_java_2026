package loops_in_java;

public class break_and_continue {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is Great!!");
            if(i==2){
                System.out.println("Happy ending!!");
                break;
            }
        }
    }
}
