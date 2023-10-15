package MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_128_LongestSequence {

    public int longestConsecutive(int[] nums) {
            ArrayList<Integer> numsList = new ArrayList<>();

            for (int num : nums) {
                numsList.add(num);
            }
            int maxSeq = 0;
            // Check of het een start van een sequence is.
            for(int j = 0; j < numsList.size(); j++){
                if(numsList.contains((numsList.get(j) -1))){
                    System.out.println(numsList.get(j) + " is geen start van sequence");
                    continue;
                }
                System.out.println(numsList.get(j) + " is wel start van sequence");
                int counter = 0;
                for(int k = j; k < numsList.size(); k++){
                    if((nums[k + 1] + 1) == nums[k]){
                        counter++;
                    } else {
                        break;
                    }
                }
                if(counter > maxSeq){
                    maxSeq = counter;
                }
            }

            return maxSeq;
    }
}
