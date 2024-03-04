public class CanSpell {
   //determine if word can be spelled with provided set of tiles
    public static boolean canSpell(String tiles, String word) {
        //Iterate through each letter of word
        for(int i = 0; i < word.length(); i++ ) {
            String letter = String.valueOf(word.charAt(i));
            if (tiles.contains(letter)) {
                tiles = tiles.replaceFirst(letter, ""); //account for multiple instances of same letter
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib")); //true
        System.out.println(canSpell("quijibo", "jig")); // false
        System.out.println(canSpell("kgjnvhrkwsa", "shark")); //true
        System.out.println(canSpell("kgjnvhrkwsa", "zag")); // false

    }
}
