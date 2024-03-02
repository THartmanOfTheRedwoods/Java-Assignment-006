public class CanSpell {
    public static void main(String[] args) {
        System.out.println(canSpell("kpalmisa", "milk"));
        System.out.println(canSpell("tasdcadd", "aeroplane"));
        System.out.println(canSpell("monalisa", "salmon"));
        System.out.println(canSpell("hobbitss", "king"));
        System.out.println(canSpell("rasmataz", "rasmatazrasmataz"));
    }

    public static boolean canSpell(String tiles, String word) {
        // put the tiles/chars into an array
        char[] tileArray = tiles.toCharArray();

        // put the chars in the word into an array, and iterate through them.
        for (char c : word.toCharArray()) {
            // check if the char is in the tiles array
            int index = -1;
            for (int i = 0; i < tileArray.length; i++) {
                if (tileArray[i] == c) {
                    index = i;
                    break;
                }
            }

            // if the char is found, remove it from the tiles array
            if (index != -1) {
                tileArray[index] = '\0'; // mark the used tile as empty
            } else {
                return false;
            }
        }
        return true;
    }
}
