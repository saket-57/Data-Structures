package stacks;

public class String2{
	public static void main(String[] args) {
		String input = ")1+2(";
		
		BracketCheck br = new BracketCheck();
		boolean res = br.checkStr(input);
		System.out.println(res);
	}
}