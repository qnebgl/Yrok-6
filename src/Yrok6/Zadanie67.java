package Yrok6;

import java.util.Scanner;

public class Zadanie67 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] createArray = createArray(size);
        int[] fillArray = fillArray(createArray);
        printArray(fillArray);
    }

    /**
     * Создает массив размера, заданного пользователем
     *
     * @param size размер массива, задаваемый пользователем
     * @return новый массив с заданным размером
     */
    static int[] createArray(int size) {
        int array[] = new int[size];
        return array;
    }

    /**
     * Заполняет массив значениями задаваемыми мользователем
     *
     * @return массив с заполнеными пользователем значениями
     */
    static int[] fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     * Печатет значения  массива
     *
     */
    static void printArray(int[] array) {
        System.out.print("Введенные значения массива: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}