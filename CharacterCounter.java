public class CharacterCounter {

    public static void main(String[] args) {
        String sentence = "recursion is replacing the repetition of loops";
        char target = 'r';
        int count = 0;
        System.out.println("Counting occurrences of '" + target + "' with a loop...");
        // --- START OF BLOCK TO REPLACE ---
        count+=countCharRecursive(sentence,target,0);
        // --- END OF BLOCK TO REPLACE ---
        System.out.println("The character '" + target + "' appears " + count + " times.");
    }
    public static int countCharRecursive(String text, char target, int index) {

     if (index>=text.length()) return 0;

     if (text.charAt(0)==target){

         return 1+countCharRecursive(text.substring(1),target,index);
     }

     else return countCharRecursive(text.substring(1),target,index);

    }

}
