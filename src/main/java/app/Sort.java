package app;

/**
 * Sort
 */
public class Sort {

    public static void shell(Integer[] arr) {
        int comparations = 0;
        int movements = 0;
        int gap;
        System.out.println(" - sorting [" + arr.length + "] -");
        for (gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i += 1) {

                int temp = arr[i];
                int j;
                System.out.print("gap :" + gap + " ");
                showIntegerArray(arr);
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                    movements++;
                }
                arr[j] = temp;
                comparations++;
            }
        }
        System.out.print("gap :" + gap + " ");
        showIntegerArray(arr);
        System.out.println("Copmarations: " + comparations);
        System.out.println("Movements: " + movements + "\n");
    }

    public static void shSort(Integer[] data) {
        int h = 1;
        int n = data.length;
        int comparations = 0;
        int movements = 0;

        System.out.println("-- sorting --");

        while (h < n) {
            h = h * 3 + 1;
        }

        h = h / 3;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = data[i];
                j = i;
                showIntegerArray(data);
                while (j >= h && data[j - h] > c) {
                    comparations++;
                    data[j] = data[j - h];
                    j = j - h;
                }
                data[j] = c;
                movements++;
            }
            h = h / 2;
        }

        System.out.println("Copmarations: " + comparations);
        System.out.println("Movements: " + movements);
    }

    public static void showIntegerArray(Integer[] data) {
        System.out.print("[");

        if (data.length == 0) {
            System.out.print("]");
            return;
        }

        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1)
                System.out.println(data[i] + "]");
            else
                System.out.print(data[i] + ", ");
        }
    }

}