package patternss;

public class patterns {
    public static void main(String[] args) {
        // for(int i =0 ; i<=5 ; i++){
        //     for(int j =5 ; j>=i ;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    


    // diamond and pyramid 

    // for(int i =1 ; i<=4 ; i++){
    //     for(int k =5-i ;k>=0 ;k--){
    //         System.out.print(" ");
    //     }
    //     for(int j =1 ; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // for(int i =0 ; i<=5 ; i++ ){
    //     for(int k=0 ; k<=i ; k++){
    //         System.out.print(" ");
    //     }
    //     for(int j =5-i ;j>=1 ;j--){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
  
    int n =10 ;
    for(int i =0 ; i<=n ;i++){
        for(int k =n-1-i ;k >=0 ; k-- ){
            System.out.print(" ");
        }
        for(int j =1 ; j<=(2*i-1) ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    int x = n -2 ;
    for(int i =0 ; i<=n-2 ; i++){
        for(int k =0 ;k<=i ; k++ ){
            System.out.print(" ");
        }
        for(int j =2*x+1 ; j>=1 ; j--){
            System.out.print("*");
        }
        System.out.println();
        x = x-1 ;
    }
}
}