package prefixsuffix;

import java.util.Scanner;

// Answer to q queries where print the sum of values 
// in given range of indices L to R
public class sumLtoR {

    public static int[] prefixsum(int a[]){
        for(int i =1 ;i<a.length ;i++){
            a[i]+=a[i-1];
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array :");
    int n = sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter "+n+" elements");
    for (int i=1 ; i<n ;i++){
        a[i]=sc.nextInt();

    }
    int prefsum[] =prefixsum(a);
    System.out.println("Enter number of queries :");
    int q= sc.nextInt();
    while(q-->0)
    {
        System.out.println("Enter range L to R:");
        int l=sc.nextInt();
        int r = sc.nextInt();
        int ans = prefsum[r] - prefsum[l-1];
        System.out.println("Sum is "+ans ); 
    }
    }
    
}

