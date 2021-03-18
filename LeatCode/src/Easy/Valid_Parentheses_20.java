package Easy;

import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses_20 {

	public static boolean isValid(String input) {
        if(input.length()%2!=0){
            return false;
        }else{
            Stack<Character> stack = new Stack<Character>();
            for(int i=0;i<input.length();i++){
                char c = input.charAt(i);
                if(stack.isEmpty()){
                    stack.push(c);
                }else{
                    if(c == '('||c == '['||c == '{'){
                        stack.push(c);
                    }else if(c == ')'){
                        if(stack.peek()=='('){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }else if(c == ']'){
                        if(stack.peek()=='['){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }else {
                        if(stack.peek()=='{'){
                            stack.pop();
                        }else{
                            return false;
                        }
                    }   
                }
            }
            return stack.isEmpty();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 System.out.println(isValid(input));
	}

}
