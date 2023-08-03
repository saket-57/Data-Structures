package stacks;

public class String3{
	public static void main(String[] args) {
		String input = "{[34+98+(3/8-9)-99]%87}";
		
		Balance str = new Balance();
		
		boolean result = str.isBalanced(input);
		System.out.println(result);
	}
}