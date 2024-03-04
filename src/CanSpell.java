import java.util.Scanner;

public class CanSpell {
    public static boolean canSpell(String tiles, String word) {
        for (char letter : word.toCharArray()) {
            int index = tiles.indexOf(letter);
            if (index == -1) {
                return false;
            }
            tiles = tiles.substring(0, index) + tiles.substring(index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your tiles: ");
        String tiles = scanner.nextLine();

        System.out.print("Enter the word you want to test: ");
        String word = scanner.nextLine();

        System.out.println("Can spell the word? " + canSpell(tiles, word));

        scanner.close();
    }
}
