package Abstract_class_and_abstract_methods;

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    public void blowhorn(){
        System.out.println("Pee Pee Poo Poo. ");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break...");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
}

public class abstract_classes_vs_interfaces {
    public static void main(String[] args) {
        AvonCycle cyclearyan = new AvonCycle();
        cyclearyan.applyBreak(77);
        System.out.println(cyclearyan.a);
    }
}
