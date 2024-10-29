   class Vehicle {
        String brand;

        void setBrand(String brand) {
            this.brand = brand;
        }

        void display(){
            System.out.println("Brand name "+ brand );
        }
    }

    class Car extends Vehicle{
        int wheels;

        void setWheels(int wheels){
            this.wheels =  wheels;
        }
        void displayWheels(){
            System.out.println("Number of Wheels "+wheels);
        }
    }

    public class inheritance {
    public static void main(String[] args) {

        Car myCar = new Car() ;
        myCar.setBrand("Tata");
        System.out.println(myCar.brand);
        myCar.setWheels(12);
        System.out.println(myCar.wheels);

        myCar.display();

    }
}