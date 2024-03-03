public class CanSpell {
    public static boolean canSpell(String tiles, String word) {
        int [] letters = new int [26];
        for (char c : tiles.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : word.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false;
            }
            letters[c - 'a'] --;
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
        System.out.println(canSpell("quijibo", "quid"));
    }
}