package patternsss;

public class p2 {

    public static void pattern1(int n ){
            int x ;
        for(int i =0 ; i<n ; i++){
            x=i ;
            for(int k =n-i-1 ; k>=0 ; k--){
                System.out.print(" ");
            }
            for(int j=0 ; j<i ; j++){
                System.out.print(x);
                x-- ;
            }
            System.out.println();
        }
    }

    public static void devanshi1(int n){
        for(int i =1 ;i<=n ; i++ ){
            for(int j =1 ; j<=(n-i) ; j++ ){
                System.out.print(" ");
            }
            for(int j =i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void pattern2(int n ){
        int o=1 ;
        int e=2 ;
    for(int i =0 ; i<n ; i++){
        for(int k =n-i-1 ; k>=0 ; k--){
            System.out.print("  ");
        }
        if (i%2==0) {
            for(int j=0 ; j<i ; j++){
                System.out.print(e+" ");
                e =e+2;
            }
        }
          else {
            for(int j=0 ; j<i ; j++){
                System.out.print(o+" ");
                o =o+2;
            }
        }
        System.out.println();
    }
}

        public static void devanshi2(int n ){

                int a =(n-3 ) ;
                int b =1 ;
                int c=1;
                for(int i =1 ; i<=n ;i++ ){
                    
                    for(int j =1 ; j<=n ; j++){
                        if(i==c ||j==c|| j==n ||i==n ){
                            System.out.print(a);
                            a--;
                            c++;
                        }
                        else
                        for(int k=a;k>=1;k--){
                            if(i==c ||j==c ||i==(n-b)|| j==(n-b)){
                                System.out.print(a);
                                c++;
                                a--;
                                b++;
                            }
                        }
                    //    else if(i==2 || j==2|| j==(n-b) ||i==(n-b) ){
                    //         System.out.print(a);
                    //         a-- ;
                    //         b++ ;
                    //     }
                    //    else if(i==3 ||j==3 || j==(n-2) ||i==(n-2) ){
                    //         System.out.print("2");
                    //     }
                    //    else if(i==4 || j==4 || j==(n-3) ||i==(n-3) ){
                    //         System.out.print("1");
                    //     }
                     
                          
                    }
                    System.out.println();
                }
        }   

        public static void test(int n ){
            int x =n ;
            while(x>=1){
           for(int i =0 ; i<=n ; i++){
            for(int j =0 ; j<=n ; j++){
                    if(i==x || j==x){
                        System.out.print(x);
                    }
                }
                System.out.println();
            }
            x-- ;
        }
        }   

    public static void main(String[] args) {
        int n = 7 ;
        test(n);
    }
}
