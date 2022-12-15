package EasyProblems;

public class LC_1588_SumAllOddSubArrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            int temp = 0;
            for(int j = i; j < arr.length; j++){
                temp += arr[j];
                if((j - i ) % 2 == 0){
                    total += temp;
                }
            }
        }
        return total;
    }
}
