package stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Balance{
	private final List<Character> leftBrackets 
									= Arrays.asList('(','{','[','<');
	private final List<Character> rightBrackets 
									= Arrays.asList(')','}',']','>');
	
	public boolean isBalanced(String input) {
		Stack<Character> st = new Stack<>();
		
		for(char ch: input.toCharArray()) {
			
			if(isLeftBracket(ch)) {
				st.push(ch);
			}
			
			if(isRightBracket(ch)) {
				if(st.empty()) return false;
				
				var top = st.pop();
				if(!matchBracket(top,ch)) return false;
			}
		}
		return st.empty();
	}
	
	
	
	private boolean isLeftBracket(char ch) {
		return leftBrackets.contains(ch);
	}
	
	private boolean isRightBracket(char ch) {
		return rightBrackets.contains(ch);
	}
	private boolean matchBracket(char left, char right) {
		return 
				leftBrackets.indexOf(left)==rightBrackets.indexOf(right);
	}
}