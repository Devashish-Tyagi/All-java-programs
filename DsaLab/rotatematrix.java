package DsaLab;
import java.util.*;
public class rotatematrix {

    
    public static void display(int a[][]){
        for(int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r , c ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows :");
        r= sc.nextInt();

        System.out.println("Enter number of column :");
        c= sc.nextInt();

        int a1[][]= new int[r][c];
        int i , j ;

        System.out.println("Enter matrix elements :");
        for( i =0 ; i<r ; i++){
            for(j=0 ; j<c ;  j++){
                a1[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }

        // rotatematrix(a1);

    }
}
