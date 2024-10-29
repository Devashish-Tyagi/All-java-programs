package elementinarray;
        // x is a unique elements in whole array.
public class xuniqueelements {
    public static String uniqueelements( int a[]) {
     int n = a.length ; 
   String s = "Method return a value at most one time   Other elements  occuring in pair only " ;
     System.out.println("Unique elements are : ");
     for(int i =0 ; i< n ; i++){
        for ( int j =i+1 ; j < n ; j++){
            if ( a[i]== a [j]){
            a[i]=a[j]=-1;
            }
        }
     }   //if method return value is integer 
        //if we put return a[i] after if then it will
        //return only a[i]
        // not return 1 
        // Main Method only return once.
     for (int i=0 ; i<n ;i ++) {
        if (a[i]> 0) {
            System.out.println(a[i]);
        }
    }
      return s ;
     // return 1 ;
    }
     public static void main(String[] args) {
        int a[]= { 1,1,2,3,4,5,6,7,8,2,3,4,5,6} ; 
        System.out.println(uniqueelements(a));
     }
    }
    
