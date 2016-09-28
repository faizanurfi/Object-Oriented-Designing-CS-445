import java.util.Random;
import java.util.StringTokenizer;
import java.util.Arrays;

public class clientClass {
		
	public static void main(String[] args) {
		
		// This runs the code for Improved Random Problem
		ImprovedRandom ir = new ImprovedRandom();
		System.out.println(ir.randomInRange(1, 100));
		
		
		// This runs the code for Improved StringTokenizer Problem
		String l = "This class is easy";
		
		ImprovedST ist = new ImprovedST(l);
		
		String [] arr = ist.tokenArray();
		
		System.out.println(Arrays.toString(arr));
	}
}