public class CanSpell {
    public static boolean canSpell(String tiles, String word){
        char[] tileArray = tiles.toCharArray(); //set of tiles

        for (char c : word.toCharArray()) {//iterate through each character
            boolean found = false;

            for (int i = 0; i < tileArray.length; i++) { //iterate through tiles to find character
                if (tileArray[i] == c) {
                    tileArray[i] = ' ';//if found remove from set
                    found = true;
                    break;

                }
            }
            if (!found) { //if not found there are no available tiles
                return false;
            }
        }
        return true; //if it can be spelled using the tiles return true
    }

    public static void main(String[] args) { //tests
        System.out.println(canSpell("abcdefg", "cab")); //true
        System.out.println(canSpell("abcdefg", "hill")); //false

    }
}
