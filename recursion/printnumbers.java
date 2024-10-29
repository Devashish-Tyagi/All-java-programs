package recursion;

public class printnumbers {
    static void printincreasing(int n ){
        if(n==1){
            System.out.println(1);
            return ;
        }
        printincreasing(n-1);
        System.out.println(n);
    }
    static void printdecreasing(int n ){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        printdecreasing(n-1);
    } 
    public static void main(String[] args) {
        int n =7 ;
        System.out.println("Natural numbers from 1 to"+n );
        printincreasing(n);
        System.out.println("Natural numbers from "+n+" to 1" );
        printdecreasing(n);
    }
}