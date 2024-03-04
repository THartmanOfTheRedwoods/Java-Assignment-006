public class CanSpell {

    public static boolean canSpell(String word, String tiles) {
        tiles = tiles.toLowerCase();
        String tilesFinal = tiles;
        for (char test : word.toCharArray()) {
            if (tiles.contains(String.valueOf(test))) {
                tiles = tiles.replaceFirst(String.valueOf(test), "");
            } else {
                System.out.println("You have insufficient letters.");
                return false;
            }
        }
        System.out.println("You are able to spell " + word + " with the tiles " + tilesFinal);
        return true;
    }

    public static void main(String[] args) {
        canSpell("syzygy", "szygyyy");
    }
}

//In the game of Scrabble, each player possesses a set of tiles with letters on them. The objective is to use these letters
// to form words, and the scoring system is based on the complexity of the words. Longer words generally yield higher scores.
// Imagine you have your set of tiles represented as a string, such as "quijibo," and you are provided with another string to test,
// like "jib."
//Objective:
//
//Write a method named canSpell that takes two strings as parameters and checks whether the set of tiles can be used to
// spell the given word. Note that you may have more than one tile with the same letter, but each tile can be used only once.
//Code:
//
//In the file CanSpell.java, implement the canSpell method in the provided Java code.
//Test your implementation with different sets of tiles and words.