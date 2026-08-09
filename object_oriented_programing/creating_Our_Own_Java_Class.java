package object_oriented_programing;
class Employ {
        int id;
        String name;
        public void printDetails(){
            System.out.println("My id is : " + id);
            System.out.println("My name is :" + name);
        }
        
    }
public class creating_Our_Own_Java_Class {

    public static void main(String[] args) {
        System.out.println("This is our custom Class.");
        Employ aryan = new Employ();
        aryan.id = 1;
        aryan.name = "Aryan Agrawal";
        aryan.printDetails();

        Employ khushi = new Employ();
        khushi.id = 2;
        khushi.name = "Khushi";
        khushi.printDetails();
       // System.out.println(aryan.id);
        //System.out.println(aryan.name);
    }
}
