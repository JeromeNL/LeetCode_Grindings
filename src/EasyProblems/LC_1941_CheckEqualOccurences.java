package EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class LC_1941_CheckEqualOccurences {
    public boolean areOccurrencesEqual(String s) {
        int[] chars = new int[26];;
        int sameValue = 0;

        for(int i = 0; i < s.length(); i++){
            chars[s.charAt(i) - 'a']++;
            sameValue = Math.max(sameValue,chars[s.charAt(i)-'a']);
        }

        for(int j = 0; j < chars.length; j++){
            if(chars[j] != sameValue && chars[j] != 0){
                return false;
            }
        }
        return true;
    }
}
