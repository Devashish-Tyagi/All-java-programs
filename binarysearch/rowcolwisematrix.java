package binarysearch;

public class rowcolwisematrix {
    // now matrix is as follows
    //    2    4   6    8
    //    5    6   7    20
    //    7    11  13   25
    //    12   14  17   30

    static public boolean searchmatrix(int a[][] , int target) {
        int n = a.length , m = a[0].length ;
        int i =0 , j=m-1 ;

        while(i<n && j>= 0){
            if(a[i][j]==target) return true ;

            if(target<a[i][j]){
                j-- ;         // move left 
            } else {
                i++ ;         // move down   
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        int a[][] = {{2,4,6,8} , {5,6,7,20} , {7,11,13,25} , {12,14,17,30}} ;
        int target = 7 ;
        System.out.println(searchmatrix(a, target));
    }
    
}
