package EasyProblems;

public class LC_2520_CounTheDivideANumber_Java {
    public int countDigits(int num) {
        int deelbaarCount = 0;
        String stringNum = Integer.toString(num);

        for(int digits = 0; digits < stringNum.length(); digits++){
                if(num % Character.getNumericValue(stringNum.charAt(digits)) == 0){
                    deelbaarCount++;
                }
        }
        return deelbaarCount;
    }
}
