import java.util.Scanner;
public class CanSpell {

    public static boolean canSpell(String word, String word2) {
        int length = word2.length();
        for (int i = 0; i < length; i++) {
            char c = word2.charAt(i);
            if (frequency(word2, c) > frequency(word, c)) {
                return false;
            }
        }
        return true;
    }
    public static int frequency(String word, char c) {
        int length2 = word.length();
        int n = 0;
        for(int i = 0; i < word.length(); i++) {
        }
        return n;
    }
    public static void main(String[] strings) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
         String word = in.nextLine();
        System.out.println("Enter a another word you would like to test: ");
         String word2 = in.nextLine();

        System.out.println("canSpell(" + word + "," + word2 + ") --> " + canSpell(word, word2));
    }
}
