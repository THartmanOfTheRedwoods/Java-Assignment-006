/**
 * @author Alexei Iachkov
 * @author Trevor Hartman
 * @date 3-3-24
 */
public class CanSpell {
    public static boolean canSpell(String tiles, String word) {
        int[] tileCount = new int[26]; //doesn't include uppercase so far
        for (int i = 0; i < tiles.length(); i++) {
            char tile = tiles.charAt(i);
            tileCount[tile - 'a']++;
        }
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (tileCount[letter - 'a'] > 0) {
                tileCount[letter - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String tiles = "hufeidnwr"; //random tiles, test 3
        String word = "rad"; //random word, test 3
        if (canSpell(tiles, word)) {
            System.out.println("The set of tiles can be used to spell the given word.");
        } else {
            System.out.println("The set of tiles cannot be used to spell the given word.");
        }
    }
}