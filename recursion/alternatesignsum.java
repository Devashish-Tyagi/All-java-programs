package recursion;

public class alternatesignsum {
             // 1-2+3-4+5-6+7
             static int altsum(int n ){
                if(n==0) return 0;
                if(n%2==0) return altsum(n-1)-n ;
                return altsum(n-1)+n ;
             }    
             static int simplesum(int n ){
                if(n==0) return 0 ;
                return simplesum(n-1) +n;
             }
             public static void main(String[] args) {
               int n =7 ;
                System.out.println(altsum(n));
                System.out.println(simplesum(n));
             }
}
