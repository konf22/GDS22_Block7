package org.campus02;

public class Printer {

    public static void main(String[] args) {
//        printFromNToZero(5);
//        printFromNToZeroRecursive(5);
        printFromZeroToNRecursive(5);
    }

    // Methodendeklaration
    public static void printFromNToZero(int n) {
        while (n >= 0) {
            System.out.println("n = " + n);
            n--;
            // n = n - 1;
        }
    }

    public static void printFromNToZeroRecursive(int n) {
        // abbruchsbestimmung
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        // rufe mich selbst nochmal auf
        printFromNToZeroRecursive(n - 1); //n updaten (1 verringern)
    }

    public static void printFromZeroToNRecursive(int n) {
        // abbruchsbestimmung
        if (n < 0) {
            return;
        }
        // rufe mich selbst nochmal auf
        printFromZeroToNRecursive(n - 1); //n updaten (1 verringern)

        // schreibe erst auf die Konsole wenn die Abbruchsbestimmung zutrifft
        System.out.println("n = " + n);
    }
}
