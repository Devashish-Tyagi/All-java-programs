package recursion;

public class checkxpresence {
    static boolean search(int a[] , int n ,int target, int idx){
        if(idx>=n)
            return false ;

            if(a[idx]==target) return true ;

            if(search(a,n, target, idx+1)) // if this is true then it will return 
                return search(a,n,target , idx+1);
                return false  ;    // the output depend on return value
            }
        public static void main(String[] args) {
        int a[]={1,2,4,7};
        int target=10;
     
        if(search(a, a.length , target,0)){
               System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
    
