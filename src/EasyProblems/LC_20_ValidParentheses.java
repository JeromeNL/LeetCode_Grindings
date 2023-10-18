package EasyProblems;

import java.util.Stack;

public class LC_20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stapel = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stapel.push(s.charAt(i));
            }

            if(s.charAt(i) == '{'){
                stapel.push(s.charAt(i));
            }

            if(s.charAt(i) == '['){
                stapel.push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                if(!stapel.firstElement().equals('(')){
                    return false;
                }
                stapel.pop();
            }

            if(s.charAt(i) == '}'){
                if(!stapel.firstElement().equals('{')){
                    return false;
                }
                stapel.pop();
            }

            if(s.charAt(i) == ']'){
                if(!stapel.firstElement().equals('[')){
                    return false;
                }
                stapel.pop();
            }

        }
        return true;
    }
}
