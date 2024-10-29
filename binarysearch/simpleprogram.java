package binarysearch;

public class simpleprogram {
    static boolean binarysearch(int a[] , int target){
        int n = a.length ;
        int st = 0 ;
        int end = n-1 ;
        while(st<=end){
            int mid = st+ (end-st)/2 ;
            if(target==a[mid]){
                System.out.println("Element is present at "+ mid);
                return true ;
            }
            else if(target<a[mid]){
                end = mid -1 ;
            }
            else
            st=mid+1 ; 
        }
    return false ;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7} ;
        int target = 7 ;
        System.out.println(binarysearch(a, target));

    }
}
