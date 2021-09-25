package Yrok6;

public class Zadanie68 {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = max(array);
        System.out.println("Максимальное значение: " + max);

        int min = min(array);
        System.out.println("Минимальное значение: " + min);

        double average = average(array);
        System.out.println("Среднее арифметическое: " + average);

        int median = median(array);
        System.out.println("Медианное значение: " + median);
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static double average(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
        }
        return average;
    }

    static int median(int[] array) {
        int median = 0;
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 1) {
                median = Math.round(array[array.length / 2]);
            } else {
                median = (array[(array.length / 2)] + array[(array.length / 2) - 1]) / 2;
            }
        }
        return median;
    }
}
