public class CanSpell {

    public static boolean canSpell(String a, String b){

        String letters = a;
        String word = b;

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            if(index != -1){
                letters = letters.substring(0, index) + letters.substring(index +1);
            } else{
                return false;
            }
        }
            return true;

    }

    public static void main(String[] args){


        String a = "quijibo";
        String b = "jib";
        if(canSpell("quijibo","jib")){
            System.out.println("The word " + b + " can be formed out of the letters " + a);
        } else{
            System.out.println("The word " + b + " cannot be formed out of the letters " + a);
        }
    }
}
