package yoo;

public class lar {

    public static void larr(int[] a ){
        int max = a[0] ;
        int sl = 0 ;

        for(int i =0 ; i<a.length ;i++){
            if(a[i]>max){
                max = a[i] ;
            }
        }
        for(int i =0 ;i<a.length; i++){
                if(a[i]>sl && a[i]!=max){
                    sl = a[i] ;
            }
        }
        System.out.println("The largest elemnt is "+max);
        System.out.println("The second Largest element is "+sl);
    }

    public static void shruti(int[] a ){
        int max = Integer.MIN_VALUE ;
        int firstMax = 0 ;
        for(int i =0; i<a.length ; i++){
            if(a[i]>max){
                max = a[i];
                firstMax =a[i] ;
            }
        }
        System.out.println(max);
        max = Integer.MIN_VALUE ;
        int sMax  = 0 ;
        for(int i =0 ; i<a.length ; i++){
            if(a[i]>max && max<firstMax){
                sMax = a[i] ;
            }
        }
        System.out.println(sMax);
    }

    public static void main(String[] args) {
        int a [] ={1,2,3,4,5,6,7, 12, 10} ;

        larr(a);
        // shruti(a);
    }
}
