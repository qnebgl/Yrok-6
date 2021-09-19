import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Заданіе 9

        String num2 = (number % 2 != 0) ? "Нечетное" : "Четное";
        System.out.println(num2);

        // Заданіе 10

        switch (number) {
            case 1:
                System.out.println("Понедельнік");
                break;
            case 2:
                System.out.println("Вторнік");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятніца");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресеніе");
                break;
            default:
                System.out.println("Некорректное чісло");
        }
    }
}

