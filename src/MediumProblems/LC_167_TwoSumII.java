package MediumProblems;

public class LC_167_TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int startPointer = 0;
        int endPointer = numbers.length - 1;
        int[] result = new int[2];

        while(startPointer < endPointer){
            if((numbers[startPointer] + numbers[endPointer]) == target){
                result[0] = startPointer + 1;
                result[1] = endPointer + 1;
                return result;
            }

            if((numbers[startPointer] + numbers[endPointer]) > target){
                endPointer--;
            }

            if ((numbers[startPointer] + numbers[endPointer]) < target) {
                startPointer++;
            }
        }
        return result;
    }
}
