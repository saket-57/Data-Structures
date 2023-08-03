package stacks;

import java.util.Stack;

public class BracketCheck{
	public boolean checkStr(String input) {
		Stack<Character> st = new Stack<>();
		
		for(var ch:input.toCharArray()) {
			if(ch=='(')
				st.push(ch);
			if(ch==')') {
				if(st.empty()) return false;
				st.pop();
			}
		}
		return(st.empty());
		
	}
}