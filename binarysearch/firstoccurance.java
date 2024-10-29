package binarysearch;

public class firstoccurance {
    // Find first occcurance of element in a multiple occurance in a array
    // eg a[]= {2,2,2,3,3,4,4,5,5,5,6,6,7,7}
    // first occurance of 4 is 5
    
    static int firstOccurance(int a[] , int target){
        int n = a.length ;
        int st =0 , end =n-1 ;
        int fo =-1 ;
        while(st<=end){
            // int mid =st+(end-st)/2 ; 
            int mid= (st+end)/2 ;
            if(a[mid]==target){
                fo= mid ;
                end =mid-1 ;
            }
            else if(target<a[mid]){
                end = mid -1 ;

            }
            else {
                st= mid +1 ;

            }
        }
        return fo ;
    }
    public static void main(String[] args) {
        int a[] = {2,2,2,3,3,4,4,5,5,5,6,6,7,7} ;
        int target = 4;
        System.out.println(firstOccurance(a, target));
    }
    
}
