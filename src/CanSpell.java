// Written By: Austin Barnett
// Date: 3/1/2024
// Version 1.0

public class CanSpell {
    public static boolean canSpell(String tiles, String word) {
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i+1);
            if (tiles.contains(letter)) {
                tiles = tiles.replaceFirst(letter, "");
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("aetjkl", "ate"));
        System.out.println(canSpell("peletx", "leet"));
    }
}
