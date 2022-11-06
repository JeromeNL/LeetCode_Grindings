package EasyProblems;

public class LC_1281_SubtractOfInteger_Java {

    public int subtractProductAndSum(int n) {
        String numberAsText = String.valueOf(n);
        int sumValue = 0;
        int multipleValue = 1;

        for(int i = 0; i < numberAsText.length(); i++){
            sumValue += Integer.parseInt(String.valueOf(numberAsText.charAt(i)));
        }

        for(int i = 0; i < numberAsText.length(); i++){
            multipleValue *=  Integer.parseInt(String.valueOf(numberAsText.charAt(i)));
        }
        return sumValue - multipleValue;
    }
}
