package EasyProblems;

public class LC_1688 {

    public int numberOfMatches(int n) {
        int teamsLeft = n;
        int totalMatches = 0;

        while(teamsLeft > 1){
            if(teamsLeft % 2 == 1){
                totalMatches += (teamsLeft -1) /2;
                teamsLeft = teamsLeft - ((teamsLeft - 1) / 2);
            }
            else{
                totalMatches += teamsLeft / 2;
                teamsLeft = teamsLeft - (teamsLeft /2);
            }
        }
        return totalMatches;
    }
}
