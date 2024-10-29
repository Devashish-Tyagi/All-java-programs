package DsaLab;
public class maxelementin2Darray {

    static int minI = 0;
    static int minJ = 0;
    
    static int maxI = 0;
    static int maxJ = 0;
    

    // Max element in array
    public static void maxinarray(int a[][]){
       int maxElement = Integer.MIN_VALUE;
       int n=3;
       int m=3;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(a[i][j]>maxElement){
                maxElement =a[i][j];
                maxJ = j;
                maxI = i ;
            }
        }
    }
    System.out.println(maxElement);
    System.out.println();
    }

    // Min element in array 
    public static void minarray(int[][] a){
        int n=3,m=3;
       int minElement = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]<minElement){
                    minElement =a[i][j];
                    minJ = j;
                    minI = i;
                }
            }
        }
        System.out.println(minElement);
    }

    // Swapping 
    public static void swapMinMax(int a[][]){
        int temp =a[minI][minJ];
        a[minI][minJ] = a[maxI][maxJ];
        a[maxI][maxJ]=temp;
    } 


    //    Display 
    public static void display(int a[][]){
        for(int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void swapping(int a[][]){
            
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        display(a);
        System.out.println("Maximum element in array");
        maxinarray(a);
        System.out.println("Minimum element in array");
        minarray(a);

        // Swapping 
        swapMinMax(a);
        System.out.println("Matrix after swapping max and min value ");
        display(a);

    }

}
