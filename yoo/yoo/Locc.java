package yoo;

public class Locc {

    public static void cook(int[] arr , int  n ){
        int count =  0 ;
        int lastOcc =0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==n ){
                count ++; 
                lastOcc = i ;
            }
        }
       System.out.println("Element count is "+ count);
       System.out.println("Last occurance is at "+lastOcc);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 1, 2 ,3,4, 6} ;
        int n = 1;
        cook(arr , n);
        // System.out.println(ans);
    }
    
}
