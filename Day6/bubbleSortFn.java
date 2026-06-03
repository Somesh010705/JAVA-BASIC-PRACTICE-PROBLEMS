public class bubbleSortFn {

    static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 8, 1, 2};

        bubbleSort(a);

        for (int x : a)
            System.out.print(x + " ");
    }
}