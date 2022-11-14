package EasyProblems;

public class LC_1342_NumbersOfSteps_Java {
    public int numberOfSteps(int num) {
        int counter = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
            }
            counter++;
        }
        return counter;
    }
}
