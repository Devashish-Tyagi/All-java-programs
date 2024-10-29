package yoo;

public class here2 {
    
    public static void main(String[] args) {
        int n =8 ;
        int x = 0 ;
        for(int i =1 ; i<n;  i++){
            for(int k=n  ; k>i ; k--){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*x+1) ; j++){
                System.out.print("*");
            }
            x++;
            System.out.println();
        }
        x=8 ;
        for(int i =n ; i>=1;  i--){
            for(int k=n  ; k>i ; k--){
                System.out.print(" ");
            }
            for(int j=(2*x+1) ; j>=3 ; j--){
                System.out.print("*");
            }
            x-- ;
            System.out.println();
        }
    }
}