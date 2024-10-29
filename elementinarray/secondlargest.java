package elementinarray;



public class secondlargest {
    public static int seclargest(int a[]) {
        int n = a.length ;
        int max = 0;  // should use Integer.MIN.VALUE
        int smax = 0;  // use Integer.MIN.VALUE
        for( int i =0 ; i< n ; i++ ){
           if (max < a[i] )
           max = a[i] ;
        }
        for( int i =0 ; i<n ; i++){
            if (a[i]!=max) {
                if (a[i]>smax)
                smax = a[i] ;
            }
        }
        return smax ; 
    }
    public static void main(String[] args) {
        int a[]= { 1,2,3,4,5,6,7,8} ;
        System.out.println(seclargest(a));
    }
}
