package recursion;

public class hcf {
    static int gcd(int x, int y){
        while(x%y!=0){
            int rem=x%y ;
            x=y ;
            y=rem ;
        }
        return y ;
    }
    static int gcd2(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y) ;
    }
    public static void main(String[] args) {
        int x=15 ,y= 24 ;
        System.out.println(gcd(x, y));
        System.out.println(gcd2(x, y));
    }
    
}
