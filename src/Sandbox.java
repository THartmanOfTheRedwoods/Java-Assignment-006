import java.util.Scanner;

public class Sandbox {

    public static boolean canSpell(String letters, String word) {
        // Converting strings to lowercase for easier comparison
        letters = letters.toLowerCase();
        word = word.toLowerCase();

        int[] letterCounts = new int[26];
        for (char c : letters.toCharArray()) { /* learning what to put in the array line was a bit rough.
             I had to get help, but I can't remember the source of that help.  Still, it worked. */
            letterCounts[c - 'a']++;
        }

        for (char c : word.toCharArray()) {
            int charIndex = c - 'a';
            if (letterCounts[charIndex] == 0) {
                return false;
            }
            letterCounts[charIndex]--;
        }

        return true;
    }

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter the letters available: ");
            String letters = scan.nextLine();

            System.out.print("Now enter the word you're trying to make: ");
            String word = scan.nextLine();

            boolean canBeSpelled = canSpell(letters, word);

            System.out.println("The word '" + word + "' can be made with those letters '" + letters + "' - " + canBeSpelled);

            System.out.print("Do you want to enter a new set of letters? (yes/no): ");
            String choice = scan.nextLine();
            continueInput = choice.equalsIgnoreCase("yes");

            System.out.println();
        }

        scan.close();
    }
}
