package EasyProblems;

import java.util.Arrays;
import java.util.HashMap;

public class LC_242_validAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] tempArray = s.toCharArray();
        char[] tempArray2 = t.toCharArray();

        Arrays.sort(tempArray);
        Arrays.sort(tempArray2);

        for(int i = 0; i < tempArray.length; i++){
            if(tempArray[i] != tempArray2[i]){
                return false;
            }
        }
        return true;
    }
}

