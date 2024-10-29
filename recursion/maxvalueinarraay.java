package recursion;

public class maxvalueinarraay {
    static int max(int a[], int idx) {
        if (idx == a.length - 1) {
            return a[idx];
        }
        int smallans = max(a, idx + 1);

        return Math.max(a[idx], smallans);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(max(a, 0));
    }
}
