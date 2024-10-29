package binarysearch;

public class searchinrotated {
    // Find the index of minimum element in n times roatetd array
    static int findmin(int a[]){
        int n = a.length-1 ;
        int st =0 , end = a.length-1 ;
        int ans =-1  ;
        while (st<=end ){
            int mid=st+(end-st)/2 ;
        if(a[mid]<=a[n]){
            ans =mid ;
            end =mid -1 ;
        }
        else {
            st =mid+1 ;
        }
    }
    System.out.println("The minimum element is present at index  :");
        return ans ;
    }
    public static void main(String[] args) {
        int a[] = {4,5,1,2,3} ;
        System.out.println(findmin(a));
    }
    
}
