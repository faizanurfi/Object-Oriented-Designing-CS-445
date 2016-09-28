import java.util.*;

public class ImprovedST extends StringTokenizer {
	
	String x = "";
	String y = " ";
	boolean z = false;
	
	public ImprovedST(String l) {
		super(l);
		x = l;
	}
	
	public ImprovedST(String l, String d) {
		super(l, d);
		x = l;
		y = d;
	}
	
	public ImprovedST(String l, String d, boolean b) {
		super(l, d, b);
		x = l;
		y = d;
		z = b;
	}
	
	public String [] tokenArray(){
		int count = 0;

		StringTokenizer tok = new StringTokenizer(x, y, z);

		
		while(tok.hasMoreTokens()){
			tok.nextToken();
			count++;
		}
		
		String arr [] = new String[count];
		
		tok = new StringTokenizer(x, y, z);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = tok.nextToken();
		}
		
		return arr;
	}
}