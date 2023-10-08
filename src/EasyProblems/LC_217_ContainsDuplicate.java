package EasyProblems;

import java.util.Arrays;
import java.util.HashMap;

public class LC_217_ContainsDuplicate {

    public boolean containsDuplicate() {
       int[] nums = {1, 2, 3, 4};

        Arrays.sort(nums);

        for(int i = 0; i < (nums.length -1 ); i++){
            if(nums[i] == nums[i +1]){
                 return true;
            }
        }
        return false;
    }


}

