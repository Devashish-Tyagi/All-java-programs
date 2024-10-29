package elementinarray;
                          // package is of lecture 16 
import java.util.Scanner;

public class firstrepeated {
    public static int firstrepeated( int a[], int n ) {
        for( int i =0 ; i<n ; i++){
            for (int j =i+1; j<n ; j++){
                if(a[i] == a[j]) 
                return i ; 
            }
        }
        return -1 ; 
    }

    public static String printarray(int a[], int n ){
         
         System.out.println("Array is :");
        for( int i=0 ; i< n  ; i++)
        System.out.print(a[i] +" ");
        return "";
    }


    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter number of elements");
        n= sc.nextInt() ;
        System.out.println("Enter the elements");
        int a[]= new int[n];
        for ( int i=0 ; i<n ; i++){
            a[i]= sc.nextInt();
        }
        
        System.out.println("Index is :");
        System.out.println(firstrepeated(a, n));
        System.out.println(printarray(a, n));
    }
    
}
