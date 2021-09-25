package Yrok6;

public class Zadanie610 {
    public static void main(String[] args) {

        print("ДЖАВА", new boolean[]{});
    }

    public static void print(String s, int... var) {
        if (var.length ==0) {
            System.out.println(s);
        } else {
            for (int element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, short... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (short element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, byte... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (byte element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, long... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (long element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, float... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (float element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, double... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (double element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, char... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (char element : var) {
                System.out.println(element);
            }
        }
    }
    public static void print(String s, boolean... var) {
        if (var.length == 0) {
            System.out.println(s);
        } else {
            for (boolean element : var) {
                System.out.println(element);
            }
        }
    }
}
