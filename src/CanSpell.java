public class CanSpell {
    public static boolean canSpell(String tiles, String word) {
        char[] tilesArray = tiles.toCharArray();
        char[] wordArray = word.toCharArray();

        for (char letter : wordArray) {
            int index = indexOf(tilesArray, letter);
            if (index != -1) {
                tilesArray[index] = '\0';
            } else {
                return false;
            }
        }

        return true;
    }

    private static int indexOf(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("quijibo","jib"));
    }
}
