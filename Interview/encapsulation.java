    class vehicle {
       private String brand ;

       public String getBrand(){
        return brand ;
       }
       public void setBrand(String brand ){
        this.brand= brand ;
       }
    }

public class encapsulation {

    public static void main(String[] args) {
        vehicle myveh = new vehicle();
        myveh.setBrand("Tata");
        System.out.println(myveh.getBrand());
    }
    
}
