package yoo;

import java.util.Scanner;

public class patternss {

    public static void devanshi(int n ){

        for(int i =1  ; i<=n ; i++){
            for(int j =1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =n-1  ; i>0 ; i--){
            for(int j =1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        devanshi(n);
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
            x-- ;
        }
    }
}
