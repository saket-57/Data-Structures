package stacks;

import java.util.Stack;

public class ReverseString{
	public String revStr (String input) {
		Stack<Character> st = new Stack<>();
		
		if(input==null) {
			throw new IllegalArgumentException();
		}
		for(char letter:input.toCharArray()) {
			st.push(letter);			
		}
		
//		String reversed = "";
		//strings are immutable in java, avoid concatenations
		
		StringBuffer reversed = new StringBuffer();
		while(!st.empty()) {
			reversed.append(st.pop());
		}
		return reversed.toString();
	}
}