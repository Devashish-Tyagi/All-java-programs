package binarysearch;

public class e2dmatrixsearch {
    // 1  3  5  7
    // 10 11 16 20
    // 23 30 34 60        sorted 2d matrix
   static public boolean searchmatrix(int a[][] , int target ){
        int n = a.length , m =a[0].length ;
        int st =0 ,  end = n*m-1 ;
        while(st <= end  ){
            int mid = st+ (end-st)/2 ;
            int midelement = a[mid/m][mid%m] ;
            if(midelement == target) return true ;
            if(target<midelement){
                end = mid-1 ;
            }  else {
                st=mid+1 ;
            }
        }
        return false ;
    }
      public static void main(String[] args) {
        int a[][] = {{1,2,3} , {7,8,9}, {12, 18, 19}} ;
        int target = 12 ;
        System.out.println("Hello"); 
    //   searchmatrix(a, target)  ; 
      System.out.println(searchmatrix(a, target));
    }
}
