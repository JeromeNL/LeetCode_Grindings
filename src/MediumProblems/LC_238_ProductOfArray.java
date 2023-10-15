package MediumProblems;

public class LC_238_ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int totalValue = 0;
        for(int i = 0; i < nums.length; i++){
            totalValue += nums[i];
        }

        for(int j = 0; j < nums.length; j++){
            result[j] = totalValue / nums[j];
        }

        for(int x = 0; x < nums.length; x++){
            System.out.println(nums[x]);
        }
        return result;
    }
}
