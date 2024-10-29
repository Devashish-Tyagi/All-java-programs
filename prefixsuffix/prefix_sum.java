package prefixsuffix;

import java.util.Scanner;

public class prefix_sum {

//     public static int[] prefixsum(int a[]){
//         int n =a.length ;
//         int pref[]= new int[n];            // Using new array
//         pref[0]=a[0];
//         for(int i =1 ; i<n ; i++){
//             pref[i]= pref[i-1]+ a[i];
//         }
//         return pref ;

//     }

public static int[] prefixxsum(int a[]) {
    int n =a.length ;
    for(int i=1 ; i<n ;i++){
        a[i]=a[i-1] + a[i] ;
    }
    return a ;

}
    public static void printarray(int a[]){
        int n= a.length ;
        for (int i=0; i<n ; i++)
        System.out.println(a[i]+ " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter "+n+" elements :");
        for (int i=0 ; i<n ; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Original array :");
        printarray(a);
        System.out.println("Prefix sum array :");
       int pref[] =  prefixxsum(a);
       printarray(pref);
    }
}