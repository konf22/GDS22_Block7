package org.campus02;

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecursiveAcc(3, 0));
        ArrayList<Integer> values = new ArrayList<>(); // STRG + ALT + v -> variable erzeugen lassen
        values.add(3);
        values.add(2);
        values.add(3);
        System.out.println(iterativeSum(values));
        System.out.println(recursiveSum(values));
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

    public static int iterativeSum(ArrayList<Integer> values) {
        int sum = 0; // Zwischenspeicher der Summe
        //for (int i = 0; i < values.size(); i++)
        for (Integer value : values) { // for-each
            sum += value;
            //sum = sum + value; // andere Schreibweise zu sum += value
        }
        return sum; // ergebnis der addition wird zurück gegeben
    }

    public static int recursiveSum(ArrayList<Integer> values) {
        // Abbruchsbestimmung
        //if (values.isEmpty()) andere Möglichkeit zu ermitteln ob noch Werte in der Liste sind
        if (values.size() == 0) {
            return 0;
        }
        // gib mir den ersten Wert in der Liste und lösche in aus der Liste
        Integer value = values.remove(0);
        return value + recursiveSum(values); // values sind hier um 1 Eintrag kleiner
    }
}
