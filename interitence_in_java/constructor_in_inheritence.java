package interitence_in_java;

public class constructor_in_inheritence {
    class base{
        public int x;
        public int getx(){
            return x;
        }
        public void setx(int x){
            this.x =x ;
        }
    }

    class derived extends base{
        public int y;
    }

    public static void main(String[] args) {
        
    }
}
