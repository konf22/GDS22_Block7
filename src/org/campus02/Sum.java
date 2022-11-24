package org.campus02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sum {

    // ArrayList vs. HashSet
    // ArrayList: geordnete Reihenfolge, Duplikate möglich, Man kann Elemente hinauflegen, herunternehmen, Länger verändert sich während der Laufzeit
    // HashSet: keine Reihenfolge (kein Index), keine Duplikate, Man kann Elemente hinauflegen, herunternehmen, Länger verändert sich während der Laufzeit

    private static List<String> numbers = new ArrayList<>();
    public static void main(String[] args) {
//        System.out.println(sumUpIterative(3));
//        System.out.println(sumUpRecursive(3));
//        System.out.println(sumUpRecursiveAcc(3, 0));
//        ArrayList<Integer> values = new ArrayList<>(); // STRG + ALT + v -> variable erzeugen lassen
//        values.add(3);
//        values.add(2);
//        values.add(3);
//        System.out.println(iterativeSum(values));
//        System.out.println(recursiveSum(values));


        // Bsp zu HashSet
//        HashSet<Integer> testSet = new HashSet<>();
//        testSet.add(1);
//        testSet.add(2);
//        testSet.add(1);
//        for (Integer i : testSet) {
//            System.out.println("i = " + i);
//        }


//        int total = sumUpRecursive(3);
//        String joinedNumbers = String.join(" + ", numbers); // hänge bei jedem Element das "+" an, nur beim letzten nicht
//        System.out.println("joinedNumbers = " + joinedNumbers);
//        System.out.println("total = " + total);


        System.out.println(sumUpBetweenRecursive(5, 10));
        System.out.println(sumUpBetweenRecursive2(5, 10));
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
        System.out.println(n + " + ");
        numbers.add(String.valueOf(n));
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

    public static int sumUpBetweenRecursive(int start, int end) {
        // Abbruchsbestimmung
        if (start == end) {
            return start;
        }

        return start + sumUpBetweenRecursive(start + 1, end);
        // annahme start = 5, end = 10
        // 5 + 6 + 7 + 8 + 9 + 10 => start
        // end bleibt immer gleich
        // => 45
    }

    public static int sumUpBetweenRecursive2(int start, int end) {
        if (end == start) {
            return end;
        }

        return end + sumUpBetweenRecursive2(start, end - 1);
        // 10 + 9 + 8 + 7 + 6 + 5
        // => 45
    }
}
