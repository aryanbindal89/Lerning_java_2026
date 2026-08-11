package access_modifiers_and_constructors;

public class constructors_in_Java {
     static class myEmploy{
        private int id;
        private String name;

        public myEmploy(){
            id = 45;
            name = "khushi";
        }

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
       /*  aryan.setName("Aryan Agrawal");
        System.out.println(aryan.getName());
        aryan.setID(5);*/
        System.out.println(aryan.getID());
        System.out.println(aryan.getName());
    }
}
