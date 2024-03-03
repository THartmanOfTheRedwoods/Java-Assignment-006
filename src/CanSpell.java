import java.util.Scanner;

public class CanSpell {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a list of tiles: ");
        String t = in.nextLine();
        System.out.println("Please enter a word: ");
        String w = in.nextLine();

        boolean spell = canSpell(t, w);
        if (spell) {
            System.out.printf("The list of tiles %s can spell the word %s.", t, w);
        } else {
            System.out.printf("The list of tiles %s can not spell the word %s.", t, w);
        }
    }

    public static boolean canSpell(String tiles, String word) {
        boolean canSpell = true;
        int wordLength = word.length();
        for (int i=0; i<wordLength; i++){
            int tilesLength = tiles.length();
            char c = word.charAt(i);
            int cIndex = tiles.indexOf(c);
            if (cIndex < 0) {
                canSpell = false;
                break;
            } else {
                tiles = tiles.substring(0,cIndex) + tiles.substring(cIndex+1, tilesLength);
            }
        }
        return canSpell;
    }
}
