package recursion;

public class kmultipleofn {
      // given a number n and value k. Print k multiples of n 
     static void pm(int n , int k ){
        if(k==1){
        System.out.println(n);
        return ;}
        pm(n, k-1);
        System.out.println(n*k);
     }
     public static void main(String[] args) {
        int n=5  , q= 7 ;
        pm(n, q);
     }
}
