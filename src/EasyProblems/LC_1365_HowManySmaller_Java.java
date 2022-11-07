package EasyProblems;

public class LC_1365_HowManySmaller_Java {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];

            int amountSmaller = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < currentNumber)
                amountSmaller++;
            }
            results[i] = amountSmaller;
        }

        for(int item : results){
            System.out.print(item);
        }
        return results;
    }
}
