package elementinarray;
import java.util.Scanner;

      // LAST OCCURANCE
public class occurance {
    public static int last0occurance(int a[], int x ) {
        int index =-1;
        for (int i=0 ; i<a.length; i++){
            if (a[i]==x)
            index=i ;
        }
        System.out.println("last occurance of number is :");
        return index ;
    }
                      //  COUNT OF OCCURANCE
     public static int countofelement(int a[],int x) {
        int count = 0 ;
        for ( int i =0 ; i< a.length ; i++){
            if (a[i]==x)
            count++ ;
        }
        System.out.println("Number of times element occur :");
       return count ;
     }
    public static void main(String[] args) {

       int a[]= {1,2,3,4,5,1,2,3,4,5,8,9,1};
        System.out.println("enter a element   ");
        Scanner sc = new Scanner(System.in); 
    
        int x = sc.nextInt();
        sc.close();       // it close the input stream 
            
        System.out.println(last0occurance(a, x ));
        System.out.println(countofelement(a, x));
    }

}
