import java.util.Scanner;







public class CanSpell {

    //boolean true false of word
    public static boolean canSpell(String tiles, String word) {
        //Convert letters to same case for comparison.
        tiles = tiles.toUpperCase();
        word = word.toUpperCase();

        //assign input of tiles to array
        int[] letterCounts = new int[26];//26 letters in the english alphabet
        for (char c : tiles.toCharArray()) {
            letterCounts[c - 'A']++;
        }
        //assign word letters to array
        for (char c : word.toCharArray()) {
            int charIndex = c - 'A';
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
            //take input of tiles from user
            System.out.print("Enter the letters available: ");
            String tiles = scan.nextLine();

            //take input of word from user
            System.out.print("Now enter the word you're trying to make: ");
            String word = scan.nextLine();

            //check if word is in tiles array
            boolean canBeSpelled = canSpell(tiles, word);

            //display results
            System.out.println("The word '" + word + "' can be made with those letters '" + tiles + "' - " + canBeSpelled);

            System.out.print("Do you want to enter a new set of letters? (yes/no): ");
            String choice = scan.nextLine();
            continueInput = choice.equalsIgnoreCase("yes");

            System.out.println();
        }

        scan.close();
    }
}


