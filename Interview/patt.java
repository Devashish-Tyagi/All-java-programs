public class patt {
    public static void main(String[] args) {

        int n =5 ;
        for(int i =0 ; i<=6 ; i++){
            for(int k = 5-i ; k>=0 ; k--){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0 ; i <=6 ; i++){
            for(int k =0  ; k<=i ; k++){
                System.out.print(" ");
            }
            for(int j =2*n-1 ; j>=1 ;  j--){
                System.out.print("*");
            }
            System.out.println();
            n-- ;
        }
    }
    
}
