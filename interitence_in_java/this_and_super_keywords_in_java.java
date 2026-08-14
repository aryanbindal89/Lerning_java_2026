package interitence_in_java;

import interitence_in_java.this_and_super_keywords_in_java.ekclass;

public class this_and_super_keywords_in_java {
    class ekclass{
        int a;
        public int getA(){
            return a;
        }
        ekclass(int v){
           this.a = v;
        }
        public int returnone(){
            return 1;
        }
    }

    class doclass extends ekclass{
        doclass(int c){
            super(c);
            System.out.println("I am a constructor...");
        }
    }
    public static void main(String[] args) {
        this_and_super_keywords_in_java obj = new this_and_super_keywords_in_java();
        ekclass e = obj.new ekclass(65); 
        doclass d = obj.new doclass(33);
        System.out.println(e.getA());


    }
}
