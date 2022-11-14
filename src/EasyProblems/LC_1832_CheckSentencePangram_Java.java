package EasyProblems;

import java.util.HashMap;

public class LC_1832_CheckSentencePangram_Java {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> alphabet = new HashMap<>();

        // Fill Map with alphabet
        for(int i = 0; i < 26; i++){
            alphabet.put((char) ('a' + i), 0);
        }

        // Count amount of every letter
        for(int j = 0; j < sentence.length(); j++){
            alphabet.replace(sentence.charAt(j), (alphabet.get(sentence.charAt(j)) + 1));
        }

        // Check appearance of every letter: if 0 -> return false;
        boolean isPangram = true;
        for(int k = 0; k < alphabet.size(); k++){
            if(alphabet.get((char) ('a' + k)) == 0){
                isPangram = false;
               break;
            }

        }
        System.out.print(isPangram);
        return isPangram;
    }
}
