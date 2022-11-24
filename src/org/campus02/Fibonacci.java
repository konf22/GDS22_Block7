package org.campus02;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10)); // Zeile kopieren -> STRG + D
        System.out.println(fibonacci(13)); // Zeile kopieren -> STRG + D
        System.out.println(fibonacci(15)); // Zeile kopieren -> STRG + D
        System.out.println(fibonacci(1)); // Zeile kopieren -> STRG + D
        System.out.println(fibonacci(2)); // Zeile kopieren -> STRG + D
    }

    public static int fibonacci(int n) {
        // Abbruchsbestimmung
        if (n == 1 || n == 2) {
            return 1;
        }

        // rekursionsschritt
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
