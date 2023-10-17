package MediumProblems;

import java.util.Objects;

public class LC_3_SubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        if(Objects.equals(s, "")){
            return 0;
        }

        int maxLength = 1;
        char leftPointer = 0;
        char rightPointer = 1;
        String temp = String.valueOf(s.charAt(0));


        while(rightPointer < s.length()){
          if(temp.contains("" + s.charAt(rightPointer))){
              leftPointer++;
              temp = temp.substring(1);
          } else {
              rightPointer++;
              temp = temp + s.charAt(rightPointer -1);
          }

          if(rightPointer - leftPointer > maxLength){
              maxLength = rightPointer - leftPointer;
          }

        }
        return maxLength;
    }
}
