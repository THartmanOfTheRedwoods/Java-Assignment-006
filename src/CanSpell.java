public class CanSpell {
    public static boolean canSpell(String tiles, String word) {

        char[] tileArray = tiles.toCharArray();
        for (char c : word.toCharArray()) {
            boolean found = false;
            for (int i = 0; i < tileArray.length; i++) {
                if (tileArray[i] == c) {
                    tileArray[i] = ' ';
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String tiles = "quijibo";
        String word = "jib";
        System.out.println(canSpell(tiles, word)); // Output: true
    }
}
