package org.campus02;

public class GGT {

    public static void main(String[] args) {
        System.out.println(ggtRecursive(11, 7));
        System.out.println(ggtRecursive(8, 4));
        System.out.println(ggtRecursive(6, 2));
        System.out.println(ggtRecursive(112, 44));
    }

    /**
     * Finde den größten gemeinsamen Teiler
     * @param a Zahl 1
     * @param b Zahl 2
     * @return größter gemeinsamer Teiler
     */
    public static int ggtRecursive(int a, int b) {
        // Abbruchsbestimmung
        // if b == 0 -> return a
        if (b == 0) {
            return a;
        }
        // wenn b > 0
        // rufe ggtRecursive auf und ersetze a durch b, und b durch den Rest von a/b
        int rest = a % b;
        return ggtRecursive(b, rest);

        // 2te Variante
        //return ggtRecursive(b, a % b);
    }
}
