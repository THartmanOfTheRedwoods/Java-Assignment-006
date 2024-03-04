import java.util.Scanner;

public class CanSpell {
    public static void main(String[] args) {
        String tiles;
        String word;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the letters from your tiles:");
        tiles = s.nextLine();
        System.out.println("Please enter the word you want to check: ");
        word = s.nextLine();

        if (canSpell(word, tiles)) {
            System.out.printf("'%s' can be spelled using the tiles '%s'", word, tiles);
        } else {
            System.out.printf("'%s' cannot be spelled using the tiles '%s'", word, tiles);
        }
    }

    public static boolean canSpell(String word, String tiles) {
        String lowercaseWord = word.toLowerCase();
        int[] tileCounts = new int[26];

        for (char ch : tiles.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                tileCounts[index]++;
            }
        }

        for (char ch : lowercaseWord.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                if (tileCounts[index] > 0) {
                    tileCounts[index]--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}