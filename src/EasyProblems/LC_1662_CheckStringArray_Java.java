package EasyProblems;

public class LC_1662_CheckStringArray_Java {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = "";
       for(int i = 0; i < word1.length; i++){
           wordOne += word1[i];
       }

        String wordTwo = "";
        for(int i = 0; i < word2.length; i++){
            wordTwo += word2[i];
        }

        if(wordOne.equals(wordTwo)){
            return true;
        }
        return false;

    }
}
