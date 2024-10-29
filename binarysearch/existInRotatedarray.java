package binarysearch;

public class existInRotatedarray {
    static int existOrNot(int a[] , int target){
        int st =0 ;
        int end = a.length -1 ;
        while(st<=end){
            int mid=st + (end-st)/2 ;
            if(a[mid]==target) {
                System.out.println("The element is present at :");
            return mid ;
        }
            if(a[mid]<a[end]){
                if(target>a[mid] && target <=a[end] ) {
                    st =mid +1 ;
                }
                else
                end=mid-1 ;
            }
        else{
            if(target>=a[st] && target<a[mid]){
                end =mid-1 ;

            }
            else {
                st =mid+1 ;

            }
        } 
    }
        return -1 ;

    }
    public static void main(String[] args) {
        int a[] = {4,5,1,2,3} ;
        int target = 2 ;
        System.out.println(existOrNot(a, target));
    }
    
}
