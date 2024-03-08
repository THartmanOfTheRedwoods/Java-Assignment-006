
public class CanSpell {
        public static boolean canSpell(String letters , String wordPossible) {
            if (letters.length() < wordPossible.length()) return false;


            for (int i = 0; i < (wordPossible.length()); i++) {
                int length = letters.length();
                int index = letters.indexOf(wordPossible.charAt(i));

                if (index==-1) return false;

                letters = letters.substring(0, index) + letters.substring(index + 1, length);
            }
            return true;
        }
        public static void main(String[] args) {
           if (canSpell("quijibo", "jib") == true){
               System.out.print("It is possible to create a word with the letters provided!");
           }
           else {
               System.out.println("It is NOT possible to create a word with the letters provided.");
           }


        }
}
