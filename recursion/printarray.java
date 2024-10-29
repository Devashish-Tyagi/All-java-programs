package recursion;

public class printarray {
    static void printarrayelement(int a[],int idx){
        if(idx==a.length) return ;
        System.out.print(a[idx]+" ");
        printarrayelement(a, idx+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7} ;
        printarrayelement(a, 0);
    }    
}
