package EasyProblems;

import java.util.HashMap;
import java.util.Stack;

public class LC_20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> ref = new HashMap<>();
        ref.put(')', '(');
        ref.put('}', '{');
        ref.put(']', '[');

        if(s.length() < 2){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(ref.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }

            if(ref.containsKey(s.charAt(i))){
                char valueAtTop = ref.get(s.charAt(i));
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() != valueAtTop){
                    return false;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
}





















