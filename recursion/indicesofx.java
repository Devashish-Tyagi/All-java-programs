package recursion;

public class indicesofx {
    static void allidx(int a[], int n, int target, int idx) {
        if (idx >= n)
            return;
        if (a[idx] == target) {
            System.out.println(idx);
        }
        allidx(a, n, target, idx + 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 7, 4, 6, 5, 7, 4, 5 };
        int n = a.length;
        int target =7 ;
        allidx(a, n, target, 0);
        
    }

}
