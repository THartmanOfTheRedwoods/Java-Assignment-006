import java.util.HashMap;
//Kelten Stowe
//I will not lie I forget to put these sorry
//3/3/2024
//This was fun to test and write I will not lie

public class CanSpell {

    public static boolean canSpell(String tiles, String word) {
        // Counts the frequency of each letter in tiles
        HashMap<Character, Integer> tileCounts = new HashMap<>();
        for (char tile : tiles.toCharArray()) {
            tileCounts.put(tile, tileCounts.getOrDefault(tile, 0) + 1);
        }
        // Check if word can be spelled using tiles
        for (char letter : word.toCharArray()) {
            if (!tileCounts.containsKey(letter) || tileCounts.get(letter) == 0) {
                return false;
            }
            tileCounts.put(letter, tileCounts.get(letter) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        // Tests the cases
        System.out.println(canSpell("abccdef", "abc")); // true
        System.out.println(canSpell("hello", "hello")); // true
        System.out.println(canSpell("aabbc", "abc")); // true
        System.out.println(canSpell("xyz", "abc")); // false
    }
}