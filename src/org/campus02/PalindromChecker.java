package org.campus02;

public class PalindromChecker {

    public static void main(String[] args) {
//        System.out.println(check("ro,tor!"));
//        System.out.println(check("Ro,tor!"));
//        System.out.println(check("Ro,torschraube!"));
//        System.out.println(check("Erika feuert nur untreue Fakire"));
        System.out.println(check("Rotor"));
    }

    /**
     * Checke, ob es sich beim übergebenen Wort/Satz um ein Palindrom handelt
     *
     * @param palindrom Wort/Satz
     * @return true, wenn palindrom
     */

    // palindrom = Rotor
    // erster Durchlauf: erstes Zeichen R, letzes Zeichen r -> prüfe restliches Wort
    // zweiter Durchlauf: palindrom = oto
    public static boolean check(String palindrom) {
        // entweder wandle palindrom in lowercase oder uppercase um
        // zu lowercase
        palindrom = palindrom.toLowerCase();

        System.out.println("palindrom = " + palindrom);
        // zu uppercase
//        palindrom = palindrom.toUpperCase();

        // wenn die länge vom palindrom == 0 oder == 1 -> dann per Definition ein Palindrom
        // Abbruchsbestimmung
        //if (palindrom.length() == 0 || palindrom.length() == 1) {
        if (palindrom.length() <= 1) {
              return true;
        }

        // erstes Zeichen kein Buchstabe
        // -> entferne erstes Zeichen und checke restliche
        char firstChar = palindrom.charAt(0); // gib uns das Zeichen an der ersten Stelle-> zB: rotor -> 'r'
        if (!Character.isLetter(firstChar)) {
            String newPalindrom = palindrom.substring(1); // entferne erstes Zeichen -> zb: rotor => otor
            return check(newPalindrom);
        }

        // letztes Zeichen kein Buchstabe
        // -> entferne letztes Zeichen und checke restliche
        // Index bei Strings: gleich wie bei arrays -> erstes Zeichen hat den index 0
        //                                              zweites Zeichen hat den index 1
        //                                              letzes Zeichen = string.length - 1
        char lastChar = palindrom.charAt(palindrom.length() - 1);
        if (!Character.isLetter(lastChar)) {
            // jetzt letztes Zeichen entfernen
            return check(palindrom.substring(0, palindrom.length() - 1)); // entferne letztes zeichen -> zb: rotor => roto
        }

        // erstes und letztes Zeichen sind Buchstaben
        // überprüfe ob sie gleich sind
        // wenn ja, entferne beide und checke restliche
        if (firstChar == lastChar) {
            // nehme alles ab index 1 => sprich index 0 wird entfernt/ignoriert
            return check(palindrom.substring(1, palindrom.length() - 1)); // entferne erstes und letzes zeichen -> zb: rotor => oto
        }

        // beide sind nicht gleich
        // kein palindrom
        return false;

    }
}
