
class Vahan{
        String brand ;
        void setBrand(String brand ){
            this.brand = brand ;
        }
        void display(){
            System.out.println("Vahan name "+ brand );
        }
    }

    class Gadi extends Vahan{
        int wheel;
        @Override
        void display(){
            System.out.println("Gadi brand "+ brand);
        }
        void setWheels(int wheel){
            this.wheel = wheel ;
        }
        void displayWheel(){
            System.out.println("Wheels"+ wheel);
        }
    }

    public class polymorphism {
    public static void main(String[] args) {
        Gadi myGadi = new Gadi();
        Vahan myVahan = new Vahan();
        myVahan.setBrand("Ford");

        myGadi.setBrand("Tata");
        myGadi.setWheels(45);
        myGadi.display();
        myVahan.display();   
    }
    
}
