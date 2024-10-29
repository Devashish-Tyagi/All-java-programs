package elementinarray;

public class tripletsum {
    public static int trippletsum(int a[], int x ) {
        int count =0 ;
    int n= a.length ; 
    System.out.println("Triplets are : ");
        for ( int  i=0 ; i< n ; i++){
        for( int j =i+1 ;j < n ; j++ ) {
            for ( int k=j+1 ; k < n ; k++){
                if ( a[i] + a[j] + a[k] == x ) {
                count ++ ;
                System.out.println(a [i] +" & "+a[j]+" & "+a[k]);
                }
                else
                continue ;
            }
        }
    }
    System.out.println("Total number of Triplets are :");
    return count ;

    }
     public static void main(String[] args) {
        
        int a[]= { 1,2,3,4,5,6,7,8,9};
        System.out.println(trippletsum(a, 10));
     }
}
