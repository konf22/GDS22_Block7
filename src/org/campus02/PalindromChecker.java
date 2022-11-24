package org.campus02;

public class PalindromChecker {

    public static void main(String[] args) {
        System.out.println(check("!a"));
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
        // wenn die länge vom palindrom == 0 oder == 1 -> dann per Definition ein Palindrom
        // Abbruchsbestimmung
        //if (palindrom.length() == 0 || palindrom.length() == 1) {
        if (palindrom.length() <= 1) {
              return true;
        }

        // erstes Zeichen kein Buchstabe
        // -> entferne erstes Zeichen und checke restliche
        char firtChar = palindrom.charAt(0); // gib uns das Zeichen an der ersten Stelle-> zB: rotor -> 'r'
        if (!Character.isLetter(firtChar)) {
            String newPalindrom = palindrom.substring(1); // entferne erstes Zeichen -> zb: rotor => otor
            return check(newPalindrom);
        }

        // letztes Zeichen kein Buchstabe
        // -> entferne letztes Zeichen und checke restliche


        // erstes und letztes Zeichen sind Buchstaben
        // überprüfe ob sie gleich sind
        // wenn ja, entferne beide und checke restliche

        // beide sind nicht gleich
        // kein palindrom
        return false;

    }
}
