package Yrok6;

import java.util.Scanner;

public class Zadanie69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию в ряду Фибоначчи: ");
        int n = scanner.nextInt();
        System.out.println("Число на заданной позиции: "+fib(n));
    }

    static int fib(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }
}
