package EasyProblems;

public class LC_1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    if(nums[i] + nums[j] == target){
                        int[] arr ={i, j};
                        return arr;
                    }
                }
            }
        }
        return null;
    }
}
