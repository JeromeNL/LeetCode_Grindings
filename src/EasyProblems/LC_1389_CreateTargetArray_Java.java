package EasyProblems;

import java.util.ArrayList;

public class LC_1389_CreateTargetArray_Java {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> list = new ArrayList();

        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            target[i] = list.get(i);
        }
        return target;
    }
}
