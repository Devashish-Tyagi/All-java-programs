package yoo;

public class pSum {


    public static void pairSum(int[] a , int n ){

        int l = a.length ;
        for(int i=0 ; i<l ;i++){
            for(int j =i+1 ;  j<l ; j++){
                if(a[i]+a[j]==n ){
                    System.out.println(a[i] + " "+ a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4 , 4 , 3} ;
        int n = 6 ;
        pairSum(a, n) ;
    }
    
}
