package EasyProblems;

public class LC_1512_NumberOfPairs_Java {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            for(int j = 0; j < i; j++){
                if(current == nums[j]){
                    counter++;
                }
            }
        }
        System.out.print(counter);
        return counter;
    }
}
