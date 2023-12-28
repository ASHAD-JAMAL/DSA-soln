package String;

import java.util.Stack;

public class ValidParenthesis20 {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stk.push(ch);
            }
            else if(stk.empty()){
                return false;
            }
            else if(stk.peek()=='{' && ch=='}'){
                stk.pop();
            }
            else if(stk.peek()=='(' && ch==')'){
                stk.pop();
            }
            else if(stk.peek()=='['&& ch==']'){
                stk.pop();
            }else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}
