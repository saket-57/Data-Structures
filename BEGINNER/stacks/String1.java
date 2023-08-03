package stacks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String1{
	public static void main(String[] arr) throws Exception {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader inp = new BufferedReader(reader);
		
		String input = inp.readLine();
		
		ReverseString res = new ReverseString();
		
		String rslt = res.revStr(input);
		System.out.println(rslt);
		
		
	}
}