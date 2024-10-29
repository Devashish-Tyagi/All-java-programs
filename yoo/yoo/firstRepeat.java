package yoo;

public class firstRepeat {

    public static int firstRepeat(int[] arr){

        for(int i =0 ;i<arr.length ; i++){
            for(int j =i+1 ; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("First Index is  ");
                     System.out.println(i);
                    System.out.println("Second Index is  ");
                     System.out.println(j);
                     System.out.println("Element is ");
                    return arr[j] ;
                }
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4,5} ;
        int ans = firstRepeat(arr) ;
        System.out.println(ans);
    }
}
