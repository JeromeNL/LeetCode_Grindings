package EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class LC_1941_CheckEqualOccurences {
    public boolean areOccurrencesEqual(String s) {
        List<Character> chars = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(!chars.contains(s.charAt(i))){
                chars.add(s.charAt(i));
            }
        }

        int currentCount = 0;
        int sameValue = 0;
        for(int j = 0; j < chars.size(); j++){
            currentCount = 0;
            for(int k = 0; k < s.length(); k++){
                if(chars.get(j).equals(s.charAt(k))){
                    currentCount++;
                }
            }
            if(j == 0){
                sameValue = currentCount;
            }
            if(currentCount != sameValue){
                return false;
            }
        }
        return true;
    }
}
