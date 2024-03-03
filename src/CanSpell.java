import java.util.Scanner;

public class CanSpell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your list of tiles: ");
        String tiles = scanner.nextLine();
        System.out.print("Enter the word you want to spell: ");
        String word = scanner.nextLine();

        boolean result = canSpell(tiles, word);

        if (result) {
            System.out.println("Yes, you can spell the word '" + word + "' with the given tiles.");
        } else {
            System.out.println("No, you cannot spell the word '" + word + "' with the given tiles.");
        }
        scanner.close();
    }
    public static boolean canSpell(String tiles, String word) {
        char[] tilesArray = tiles.toCharArray();
        char[] wordArray = word.toCharArray();
        int[] charCount = new int[26];

        for (char tile : tilesArray) {
            charCount[tile - 'a']++;
        }

        for (char letter : wordArray) {
            if (charCount[letter - 'a'] == 0) {
                return false;
            }
                charCount[letter - 'a']--;
            }
        return true;
    }

}
