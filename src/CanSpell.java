public class CanSpell {
    public static boolean canSpell(String A, String B) {
        String tiles = A;
        String word = B;

        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            int index = tiles.indexOf(letter);

            if (index != -1) {
                tiles = tiles.substring(0, index) + tiles.substring(index + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String tiles = "exampletiles";
        String word = "example";

        if (canSpell(tiles, word)) {
            System.out.println("Yes, you can spell the word.");
        } else {
            System.out.println("No, you can't spell the word.");
        }
    }
}

