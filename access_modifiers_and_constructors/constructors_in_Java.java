package access_modifiers_and_constructors;

public class constructors_in_Java {
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
        
    }
}
