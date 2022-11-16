package EasyProblems;

public class LC_1295_FindEvenDigits_Java {

    public int findNumbers(int[] nums) {
        int counter = 0;

        for(var item : nums){
            String textValue = String.valueOf(item);
            if(textValue.length() % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
