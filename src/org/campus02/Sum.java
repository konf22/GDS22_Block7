package org.campus02;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecursiveAcc(3, 0));
    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        // !!!! Abbruchsbestimmung
        if (n <= 0) {
            return acc;
        }
        acc = acc + n; // Summiere und merke dir die Summe
        return sumUpRecursiveAcc(n - 1, acc);
    }

    public static int sumUpRecursive(int n) {
        // !!!!!! Abbruchsbestimmung
        if (n <= 0) {
            return n;
        }
        return n + sumUpRecursive(n - 1);
    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // beginne mit 1,
            // laufe solange du kleiner gleich n bist
            // erhöhe nach jeder Iteration um i um 1
            sum = sum + i;
        }
        // retourniere das Ergebnis
        return sum;
    }
}
