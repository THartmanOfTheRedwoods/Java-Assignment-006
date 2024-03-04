
import java.util.Scanner;
public class CanSpell {

    public static boolean canSpell(String x, String y) {
        int[] character = new int[26];

        for (char c : x.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                character[c - 'a']++;
            }
        }

        for (char c : y.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (character[c - 'a']-- <= 0) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string of letters");
        String letters = scanner.nextLine();
        System.out.println("Enter the word you would like to test");
        String word = scanner.nextLine();

        System.out.println(canSpell(letters, word));
        }
    }
