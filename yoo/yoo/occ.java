package yoo;

public class occ {

    public static int cook(int[] arr , int  n ){
        int count =  0 ;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==n ){
                count ++; 
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1} ;
        int n = 2;
        int ans = cook(arr , n);
        System.out.println(ans);
    }
    
}
