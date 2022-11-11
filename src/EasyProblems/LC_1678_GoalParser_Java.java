package EasyProblems;

public class LC_1678_GoalParser_Java {
    public String interpret(String command) {
        String result = "";
        for(int i = 0; i < command.length();){
            if (command.charAt(i) == 'G') {
                result+= "G";
                i++;
            } else if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    result+= "o";
                    i +=2;
                } else{
                    result += "al";
                    i += 4;
                }
            }
        }
        System.out.print(result);
        return "";
    }
}
