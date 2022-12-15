import EasyProblems.LC_1588_SumAllOddSubArrays;
import EasyProblems.LC_709_ToLowerCase_Java;

public class MainClass {

    public static void main(String[] args) {
        int[] arraytest = new int[]{1, 4, 2, 5, 3};
        LC_1588_SumAllOddSubArrays test = new LC_1588_SumAllOddSubArrays();
        System.out.println(test.sumOddLengthSubarrays(arraytest));
}
}
