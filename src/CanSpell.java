public class CanSpell {

    public static boolean canSpell(String tiles, String word) {
        if(word.length() > tiles.length()) {return false;}
        int n = word.length();
        for(int i=0; i < n; i++) {
            int index;
            if( (index = tiles.indexOf(word.charAt(i))) == -1 ) return false;
            tiles = tiles.substring(0, index) + tiles.substring(index+1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("quijibo ", "jib"));
    }
}