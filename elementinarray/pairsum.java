package elementinarray;

public class pairsum {
    public static int pairsumm(int a[], int x){
        int count =0 ;
        int n =a.length ;
        System.out.println("Pairs are :");
        for(int i =0 ; i< n ; i++){
            for ( int j = i+1 ; j< n; j++){
                if ( a[i]+a[j]== x){
                count ++ ;
                System.out.println(a[i]+" & "+a[j]);
                }
            } }
    System.out.println("Total number of pairs : ");
            return count ;
    }
        public static void main(String[] args) {
            int a[]= { 1,2,3,4,5,6,7,8,9} ; 
         System.out.println(pairsumm(a, 10)) ; 
         
        }
    }