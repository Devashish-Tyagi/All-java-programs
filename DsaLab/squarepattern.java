package DsaLab;

import java.util.Scanner;

public class squarepattern {

    public static void pattern(int n) {
        int size = 2 * n - 1;
        int front = 0;
        int back = size-1 ;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j<=back; j++) {
                    if (i == front || i == back || j == front || j == back) 
                        a[i][j] = n;
                    
                }
            }
            front++;
            back--;
            n--;
        }
        display(a, size);

    }

    public static void display(int a[][], int size) {
        for (int i = 0; i <size; i++) {
            for (int j = 0;j< size; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int n = 4;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        pattern(n);
    }

}
