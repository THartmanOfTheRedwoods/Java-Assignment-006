public class CanSpell {
    public static boolean canSpell(String tile, String word) {

        for (int index = 0; index < word.length(); index++) {
            if (tile.indexOf(word.charAt(index)) == -1) {

                return false;

            } else {
                //return true;

            }
        }

        return true;

    }
    public static void main(String[] args){
        System.out.println(canSpell("quijibo", "jib"));
        System.out.println(canSpell("quijibo", "jiba"));
    }
}
