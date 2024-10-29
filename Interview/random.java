import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        // Random randomNum = new Random();
        // int randomNumber = randomNum.nextInt(100);
        // System.out.println("Random numbers "+ randomNumber);
        
        double random = Math.random();
        int ran = (int)(random*100) ;
        System.out.println(ran);
    }   
}
