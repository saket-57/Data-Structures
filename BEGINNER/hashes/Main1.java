package hashes;

//import java.util.HashMap;
//import java.util.Map;

public class Main1{
	public static void main(String [] args) {
		charFinder finder = new charFinder();
		char ch = finder.findFirstNonRepeatingChar("my name is");
		System.out.println(ch);
	}
}