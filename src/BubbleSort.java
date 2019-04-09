class BubbleSort {
    public static void main(String[] args) {
        int[] values = {9, 8, 7, 4, 5, 6, 3, 7, 1};

        System.out.println("Original Values");
        for (int value : values) {
            System.out.println(value);
        }

        bubbleSort(values);

        System.out.println("Sorted Values:");
        for (int value : values) {
            System.out.println(value);
        }
    }

    private static int[] bubbleSort(int[] values) {
        int counter = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                int temp1 = values[i];
                int temp2 = values[i + 1];
                values[i] = temp2;
                values[i + 1] = temp1;
                counter++;
            }
        }

        if (counter == 0) {
            return values;
        }

        return bubbleSort(values);
    }
}
