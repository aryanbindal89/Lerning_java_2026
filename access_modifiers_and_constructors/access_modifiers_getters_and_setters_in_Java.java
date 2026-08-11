package access_modifiers_and_constructors;

public class access_modifiers_getters_and_setters_in_Java {
   static class myEmploy{
        private int id;
        private String name;

        public String getName(){
            return name;
        }

        public void setName(String n){
            name = n;
        }
        public void setID(int i){
            id = i;
        }
        public int getID(){
            return id;
        }
    }
    public static void main(String[] args) {
        myEmploy aryan = new myEmploy();
        aryan.setName("Code With Aryan");
        System.out.println(aryan.getName());
       // aryan.id = 1;
        //aryan.name = "Aryan Agrawal";

    }
}
