package patternsss;

public class p1 {

    public static void pattern1(int n ){
            int x  ;

            for(int i =1 ; i<=n ;i++){
                x =1 ;
                // for(int k =n-i-1 ; k>=0 ;k-- ){
                //     System.out.print(" ");
                // }
                for(int j =0 ; j<(n-i) ; j++){
                    System.out.print(" ");
                }
                for(int j =1 ; j<=i ; j++ ){
                    System.out.print( x+" " );
                    x = x *(i-j)/j ;
                }
                System.out.println();
            }
    }

    public static void pattern2(int n ){
        int x=1  ;
        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(x*x+" ");
                x++ ;
            }
            System.out.println();
        }
    }

    public static void pattern3(int n ){
        int a =1 , b=1 ,c;

        for(int i =1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(a +" ");
                c =a+b ;
                a=b ;
                b=c ;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int n =5 ;
         pattern3(n);
    }   
}
