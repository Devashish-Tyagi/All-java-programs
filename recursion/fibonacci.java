package recursion;

public class fibonacci {
    static int fib(int n ){
        if((n==0)||(n==1)){
            return n ;                 // also print series upto n .
        }
        int prev =fib(n-1);
        int prevprev=fib(n-2);
        return prev+prevprev;
    }

    public static void main(String[] args) {
        int n =5 ;
        System.out.println(fib(n));

        for(int i =0 ;i<=n ;i++){
            System.out.print(fib(i)+" ");
          }
    }
}
