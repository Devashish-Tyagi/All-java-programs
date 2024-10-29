package recursion;

public class ppowerq {
    static int pow(int p,int q){
        if(q==0){
        return 1;
        }
        return pow(p, q-1)*p;
    }
    static int power(int p, int q){
        if(q==0) return 1;
        int smallpow=pow(p, q/2);
        if(q%2==0)
        return smallpow *smallpow ;

        return p*smallpow*smallpow ;
    }
    public static void main(String[] args) {
     System.out.println( power(2, 10));  
       System.out.println( pow(2, 10) );
    }
    
}



