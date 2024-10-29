public class selectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            // Swapping

            if (minIndex != i) {
                // swap(a[min_index],a[i])
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 7, 6, 5, 3, 4, 2, 1 };
        selectionSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}