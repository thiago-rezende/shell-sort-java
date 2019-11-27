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