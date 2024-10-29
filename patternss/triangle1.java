package patternss;

class triangle1 {
    public static void main(String[] args) {
        // int z =1 ;
        // for(int i =0 ; i<5 ;i++){
        //     for(int j= 4;j>=i ;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k =1 ;k<=z ;k++){
        //         System.out.print(k);
        //     }
        //     z+=2 ;
        //     System.out.println();
        // }
        int n =5 ;
       
        // for(int i =0 ; i<n ; i++){
        //     for(int k =n-1 ;k>i;k-- ){
        //         System.out.print(" ");
        //     }
        //     for(int j=0 ; j<i+1 ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i =0 ; i<=n ; i++){
            for(int k =n-1-i ; k>=0 ; k--){
                System.out.print(" ");
            }
            for(int j =1 ; j<=(2*i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}