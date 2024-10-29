public class fiboos {


    public static int fibos(int n){
        if( n<=1)
        return n ;
        else
        return fibos(n-1)+fibos(n-2) ;

    }
    public static void main(String[] args) {
        int n = 6 ;

        for(int i=0 ; i<n ;i++){
            System.out.print(fibos(i)+" ") ;
        }

    }
    
}
