public class CanSpell {
    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
        System.out.println(canSpell("program", "nope"));
        System.out.println(canSpell("thanks", "tan"));
    }
    public static boolean canSpell(String tile, String word) {
        if(tile.length() < word.length()) {
            return false;
        }
        for (char c : word.toCharArray()) {
            int index = tile.indexOf(c);

            if(index == -1) {
                return false;
            }

            tile = tile.substring(0, index) + tile.substring(index + 1);
        }
        return true;

    }
}
