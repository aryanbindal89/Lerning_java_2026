package Abstract_class_and_abstract_methods;

public class java_Interfaces_example_and_default_methods {
    interface Camera {
        void Snap();
        void Video(); 
    }

    interface wifi{
        String[] Getnetwork();
        void ConnectToNetwork(String network);
    }

    class Phone{
        void callNumber(int phoneNumber){
            System.out.println(" Calling... " + phoneNumber);
        }
         void pickPhoneNumber(){
            System.out.println("Connecting...");
         }

        }
        class SmaertPhone extends Phone implements wifi, Snap{
      
    public void Snap(){
      System.out.println("Takin Snap...");
        }
        public void wifi(){
      System.out.println("opening Wifi...");
        }
    
        }
        public static void main(String[] args) {
            

        }
    }
  
    
    
