package binarysearch;

public class recursiveprogram {
    static boolean binarysearch(int a[] , int target , int st , int end ){
        if(st>end)
        return false ;
        int mid = st + (end-st)/2 ;
        if(target == a[mid]){
            System.out.println("Elemnt is present at "+ mid);
            return true ;

        }
        else if(target < a[mid]){
            return binarysearch(a, target , st , (mid-1)) ;
        }
        else
        return binarysearch(a, target, mid+1, end) ;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7} ;
        int target = 7 ;
        System.out.println(binarysearch(a, target,0, a.length-1));
    }

}
