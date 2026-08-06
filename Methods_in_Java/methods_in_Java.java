package Methods_in_Java;

public class methods_in_Java {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z= (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c;
        c= logic(a, b);
        System.out.println(c);

        
    }
        
    
}
