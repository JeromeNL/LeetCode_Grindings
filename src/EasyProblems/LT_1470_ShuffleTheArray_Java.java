package EasyProblems;

public class LT_1470_ShuffleTheArray_Java {

    public int[] shuffle(int[] nums, int n) {
        int[] numbers = new int[nums.length];

        for(int i = 0; i < n; i++) {
            numbers[i *2 ] = nums[i];
            numbers[(i * 2) + 1] = nums[i + n];
        }

        return numbers;
    }
}
